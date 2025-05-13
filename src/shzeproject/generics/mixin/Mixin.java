package shzeproject.generics.mixin;

public class Mixin implements IBase, ISerialNumber, ITimeStamp{
    private final IBase baseObject = new Base();
    private final ISerialNumber serialObject = new SerialNumber();
    private final ITimeStamp timeStampObject = new TimeStamp();

    @Override
    public void set(String val) {
        baseObject.set(val);
    }

    @Override
    public String get() {
        return baseObject.get();
    }

    @Override
    public long getSerialNumber() {
        return serialObject.getSerialNumber();
    }

    @Override
    public long getStamp() {
        return timeStampObject.getStamp();
    }

    public static void main(String[] args) {
        Mixin mixin1 = new Mixin(), mixin2 = new Mixin();

        mixin1.set("I am Mixin number one");
        mixin2.set("I am Mixin number two");

        System.out.println(mixin1.get() + " -> " + mixin1.getSerialNumber() + " -> " + mixin1.getStamp());
        System.out.println(mixin2.get() + " -> " + mixin2.getSerialNumber() + " -> " + mixin2    .getStamp());
    }
}
