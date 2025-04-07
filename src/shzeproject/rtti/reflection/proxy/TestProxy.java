package shzeproject.rtti.reflection.proxy;

import java.lang.reflect.Proxy;

public class TestProxy {
    static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("Somebody!");
    }

    public static void main(String[] args) {
        // consumer(new ObjectProxy(new RealObject()));

        RealObject realObject = new RealObject();

        Interface realProxy = (Interface) Proxy.newProxyInstance(
            Interface.class.getClassLoader(), 
            new Class<?>[]{Interface.class}, 
            new DynamicObjectProxy(realObject));

        System.out.println(realProxy.say());
         
    }
    
}
