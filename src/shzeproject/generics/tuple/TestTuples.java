package shzeproject.generics.tuple;

import shzeproject.rtti.typeinfo.pets.IPet;
import shzeproject.rtti.typeinfo.pets.Pet;

/*
 * По заданию необходимо использовать обобщенные типы, для реализации
 * кортежей различной длинны, хранящихся в них аргументов.
 */

public class TestTuples {

    static TupleTwo<String, Integer> twoTuple(){
        return new TupleTwo<>("Two", 2);
    }
    
    static SixTuple<String, Integer, Integer, Integer, IPet, Integer> sixTuple(){
        return new SixTuple<>("Six", 6, 6, 6, Pet.randomPet(), 2);
    }

    public static void main(String[] args) {
        TupleTwo<String, Integer> tuple = twoTuple();
        System.out.println(tuple);
        // tuple.obj1 = "Three"; -> произойдет ошибка компиляции т.к поле final
        System.out.println(sixTuple());
    }
}
