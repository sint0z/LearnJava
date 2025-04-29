package shzeproject.generics.problems;

import shzeproject.generics.Holder;

public class AutoPackage {
    public static void main(String[] args) {

        //Демонстрация использования обобщения и авто-упаковки
        Holder<Byte> hByte = new Holder<>();
        hByte.set((byte) 2);
        byte bNum = hByte.get();
        System.out.println(bNum);

        Holder<Short> hShort = new Holder<>();
        hShort.set((short)56);
        short sNum = hShort.get();
        System.out.println(sNum);

        Holder<Integer> hInteger = new Holder<>();
        hInteger.set(100);
        int iNum = hInteger.get();
        System.out.println(iNum);

        Holder<Long> hLong = new Holder<>();
        hLong.set(1L);
        long lNum = hLong.get();
        System.out.println(lNum);

        Holder<Float> hFloat = new Holder<>();
        hFloat.set(10.0f);
        float fNum = hFloat.get();
        System.out.println(fNum);

        Holder<Double> hDouble = new Holder<>();
        hDouble.set(19.34d);
        double dNum = hDouble.get();
        System.out.println(dNum);

        Holder<Boolean> hBoolean = new Holder<>();
        hBoolean.set(true);
        boolean bool = hBoolean.get();
        System.out.println(bool);

    }
}
