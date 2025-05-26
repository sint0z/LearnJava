package shzeproject.generics.mixin.proxymixin;

import shzeproject.generics.mixin.*;

import static shzeproject.generics.tuple.Tuple.*;

import shzeproject.generics.tuple.TupleTwo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class MixinProxy implements InvocationHandler {
    private final Map<String,Object> delegatedByMethod;

    @SafeVarargs
    private MixinProxy(TupleTwo<Object,Class<?>> ...pairs){
        delegatedByMethod = new HashMap<>();
        for(TupleTwo<Object, Class<?>> pair : pairs) {
            for(Method method : pair.obj2.getMethods()){
                String methodName = method.getName();
                if(!delegatedByMethod.containsKey(methodName)) {
                    delegatedByMethod.put(methodName, pair.obj1);
                }
            }
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        Object delegated = delegatedByMethod.get(methodName);
        return method.invoke(delegated, args);
    }

    @SafeVarargs
    public static Object newInstance(TupleTwo<Object, Class<?>> ...pairs){
        Class<?>[] interfaces = new Class[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            interfaces[i] = pairs[i].obj2;
        }

        ClassLoader cl = pairs[0].obj1.getClass().getClassLoader();
        return Proxy.newProxyInstance(cl,interfaces,new MixinProxy(pairs));
    }

    public static void main(String[] args) {
        Object mixin = MixinProxy.newInstance(
                tuple(new Base(), IBase.class),
                tuple(new TimeStamp(), ITimeStamp.class),
                tuple(new SerialNumber(), ISerialNumber.class)
        );

        IBase b = (IBase) mixin;
        b.set("Str Base");
        b.get();
    }
}
