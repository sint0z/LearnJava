package shzeproject.rtti.reflection.proxy;

public class ObjectProxy implements Interface{
    private final Interface proxied;

    public ObjectProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        long startTime = System.currentTimeMillis();
        proxied.doSomething();
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Method work is " + duration + " seconds");
    }

    @Override
    public void somethingElse(String args) {
        proxied.somethingElse(args);
    }

    @Override
    public String say() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'say'");
    }
}

