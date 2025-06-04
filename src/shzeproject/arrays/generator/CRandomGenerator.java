package shzeproject.arrays.generator;

import shzeproject.generics.generator.Generator;

import java.util.Random;

public abstract class CRandomGenerator implements IGenerators{
    private static final Random random = new Random();

    public static class RGBoolean implements Generator<Boolean> {

        @Override
        public Boolean next() {
            return random.nextBoolean();
        }
    }

    public static class RGByte implements Generator<Byte>{
        @Override
        public Byte next() {
            return (byte) random.nextInt();
        }

    }

    public static class RGShort implements Generator<Short>{
        @Override
        public Short next() {
            return (short) random.nextInt();
        }
    }

    public static class RGInteger implements Generator<Integer>{
        private int mod = 1000;

        public RGInteger() {
        }

        public RGInteger(int mod) {
            this.mod = mod;
        }

        @Override
        public Integer next() {
            return random.nextInt(mod);
        }
    }

    public static class RGFloat implements Generator<Float>{

        @Override
        public Float next() {
          return ((float) (Math.round(random.nextFloat()) * 100)) / 100;
        }
    }

    public static class RGDouble implements Generator<Double>{
        @Override
        public Double next() {
            return ((double) (Math.round(random.nextDouble()) * 100)) / 100;
        }
    }

    public static class RGCharacter implements Generator<Character>{
        @Override
        public Character next() {
            return CountingGenerator.chars[random.nextInt(CountingGenerator.chars.length)];
        }
    }

    public static class RGString extends CountingGenerator.GString{

        public RGString() {}

        public RGString(int len) { super(len); }

        // Initialization
        // protected Generator<Character> cg = new GCharacter();
        {
            cg = new RGCharacter();
        }
    }

    public static void main(String[] args) {
        GeneratorTest.test(CRandomGenerator.class);
    }
}
