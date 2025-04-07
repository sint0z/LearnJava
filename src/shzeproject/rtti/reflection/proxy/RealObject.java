package shzeproject.rtti.reflection.proxy;

public class RealObject implements Interface {

    @Override
    public void doSomething() {
        System.out.println("RealObject.doSomething()");
    }

    @Override
    public void somethingElse(String args) {
        System.out.println("RealObject.somethingElse(" + args + ")");
    }

    @Override
    public String say() {
        return "RealObject.say()";
    }

}
