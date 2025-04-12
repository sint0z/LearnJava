package shzeproject.generics;

import shzeproject.generics.generator.Generator;

public class CounterObject {
    private static long counter = 0;
    private final long id = counter++;

    public long id(){
        return this.id;
    }

    @Override
    public String toString() {
        return String.format("-> %s [%d]", this.getClass().getSimpleName(), id);
    }

    public static void main(String[] args) {
        Generator<CounterObject> gen = BasicGenerator.create(CounterObject.class);
        for(int i = 0; i < 5; i++){
            System.out.println(gen.next());
        }
    }
}
