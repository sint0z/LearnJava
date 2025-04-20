package shzeproject.generics.wildcard;

import shzeproject.rtti.typeinfo.pets.Pet;

public class Contravariant {

    public static <T> void method(GenericOne<? super GenericTwo<T>> consumer, GenericTwo<T> producer) {
        consumer.set(producer); // Можно передать producer, т.к. consumer принимает GenericTwo<T> или его супертипы
    }

    public static void main(String[] args) {

    }
}
