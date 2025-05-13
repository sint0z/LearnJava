package shzeproject.generics.mixin;

public class SerialNumber implements ISerialNumber{
    private static long counter = 1;
    private final long serialNumber = counter++;

    @Override
    public long getSerialNumber() {
        return serialNumber;
    }
}
