package shzeproject.arrays.generator;

import shzeproject.generics.generator.Generator;

public interface CountingGenerator extends IGenerators{

    char[] chars = "absdfghijklmnopqrstywdxyz".toCharArray();

    class GBoolean implements Generator<Boolean>{
        private boolean value = true;
        @Override
        public Boolean next() {
            value = !value;
            return value;
        }
    }

    class GByte implements Generator<Byte>{
        private byte value = 0;
        @Override
        public Byte next() {
            return value++;
        }
    }

    class GShort implements Generator<Short>{
        private short value = 0;
        @Override
        public Short next() {
            return value++;
        }
    }

    class GInteger implements Generator<Integer>{
        private int value = 0;
        @Override
        public Integer next() {
            return value++;
        }
    }

    class GFloat implements Generator<Float>{
        private float value = 0f;
        @Override
        public Float next() {
            float result = value;
            value += 1.0f;
            return result;
        }
    }

    class GDouble implements Generator<Double>{
        private Double value = 0d;
        @Override
        public Double next() {
            double result = value;
            value += 1.0d;
            return result;
        }
    }

    class GCharacter implements Generator<Character>{
        private int index  = -1;
        @Override
        public Character next() {
            index = (index + 1) % chars.length;
            return chars[index];
        }
    }

    class GString implements Generator<String>{
        private int len = 7;

        public GString() {
        }

        public GString(int len) {
            this.len = len;
        }

        protected Generator<Character> cg = new GCharacter();
        @Override
        public String next() {
            char[] buf = new char[len];
            for(int i = 0; i < len; i++){
                buf[i] = cg.next();
            }
            return String.valueOf(buf);
        }
    }
}
