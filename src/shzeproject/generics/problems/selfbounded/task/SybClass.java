package shzeproject.generics.problems.selfbounded.task;

import java.util.Collections;

public class SybClass extends Base<SybClass>{
    @Override
    public SybClass perform(SybClass argument) {
        System.out.println("Perform in subclass");
        return this;
    }

    public static void main(String[] args) {
        SybClass sybClass = new SybClass();

        SybClass result = sybClass.execute(sybClass);
        System.out.println(result instanceof SybClass);
        System.out.println(result == sybClass);
    }
}
