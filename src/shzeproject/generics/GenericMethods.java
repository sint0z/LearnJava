package shzeproject.generics;

import shzeproject.generics.generator.Fibonacci;

public class GenericMethods {
    public <T> void printClassName(T obj){
        System.out.println(obj.getClass().getName());
    }

    public <A,B,C> void printThreeClassName(A objA, B objB, C objC){

        String nameA = objA.getClass().getSimpleName();
        String nameB = objB.getClass().getSimpleName();
        String nameC = objC.getClass().getSimpleName();

        System.out.printf("This objects is: { %s | %s | %s }", nameA, nameB, nameC);
    }

    public <A,B> void print(A objA, B objB, String separ){
        String nameA = objA.getClass().getSimpleName();
        String nameB = objB.getClass().getSimpleName();
        System.out.println(nameA + separ + nameB);
    }
    
    public static void main(String[] args) {
        GenericMethods methods = new GenericMethods();
        methods.printClassName(" ");
        methods.printClassName(1);
        methods.printClassName(new GenericMethods());

        System.out.println(" ");

        methods.printThreeClassName(" ", 100, new Fibonacci());
        
        System.out.println(" ");

        methods.print(" ", 193l, " / ");
    }
}
