package shzeproject.rtti.reflection.proxy;

import java.lang.classfile.ClassFile;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicObjectProxy implements InvocationHandler{
    private final Object proxied;


    public DynamicObjectProxy(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        
        long startTime = System.currentTimeMillis();
        Object obj = method.invoke(proxied, args);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Method work is " + duration + " seconds");
        // System.out.println("Proxy object" + proxy); -> т.к объект заместитель вызывает для своих методов invoke()
        return obj;
    }

}

//#TODO ПРОЕКТ (транзакций) стр. 487, глава 14
