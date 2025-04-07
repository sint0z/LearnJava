package shzeproject.rtti.typeinfo.pets;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import shzeproject.rtti.reflection.nullobject.Null;

public class NullPetProxyHandler implements InvocationHandler {
    private String name;
    private IPet petProxied = new NPet();

    public NullPetProxyHandler(Class<? extends IPet> type){
        this.name = type.getSimpleName() + "Null";
    }

    private class NPet implements IPet, Null{

        @Override
        public String getName() {
            return name;
        }
        
        @Override
        public String toString() {
            return getName();
        }

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(petProxied, args);
    }

}
