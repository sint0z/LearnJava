package shzeproject.generics.dacktypeproblem.functionobj;

import shzeproject.generics.Generators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {
    private static final Random RANDOM = new Random();

    // @FunctionalInterface -> функциональные интерфейсы
    // Function<T,R> -> R apply(T x);
    // Consumer<T> -> void accept(T t); - потребитель
    // Supplier<T> -> T get(); - поставщик
    // Predicate<T> -> boolean test(T t);
    // BinaryOperation<T> -> T apply(T x, T,y);
    // UnaryOperation<T> -> T apply(T x);

    public static <T> T reduce(Iterable<T> seq, BinaryOperator<T> combiner){
        Iterator<T> itr = seq.iterator();
        if(itr.hasNext()){
            T result = itr.next();
            while (itr.hasNext()) {
                result = combiner.apply(result, itr.next());
            }
            return result;
        }

        return null;
    }

    public static <T> Supplier<T> forEach(Iterable<T> siq, UnaryOperator<T> fun){
        T result = null;
        for(T elem : siq){
           result = fun.apply(elem);
        }


        final T finalResult = result;
        return () -> finalResult;
    }

    public static <T,R> List<R> transform(Iterable<T> seq, Function<T,R> func){
        final List<R> result = new ArrayList<>();
        for (T elem : seq){
            result.add(func.apply(elem));
        }
        return result;
    }

    public static <T> List<T> filter(Iterable<T> seq, Predicate<T> pred){
        List<T> result = new ArrayList<>();
        for(T elem : seq){
            if(pred.test(elem)){
                result.add(elem);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<ClassOne> listClassOne = new ArrayList<>();
        List<ClassTwo> listClassTwo = new ArrayList<>();

        Generators.fill(listClassOne, () ->
                new ClassOne(RANDOM.nextInt(100)), 10);
        Generators.fill(listClassTwo, () ->
                new ClassTwo("String_" + RANDOM.nextInt(100)), 10);

        System.out.println(reduce(listClassOne, (x, y) -> {
            int first = x.getValue();
            int second = y.getValue();

            ClassOne result = new ClassOne(-1);

            if(first != second){
                result.setValue(first + second);
            }

            return result;
        }   ));

        System.out.println(forEach(transform(listClassTwo, (x) -> {
                    String value = x.getValue();
                    System.out.println(value);
                    try {
                        return Integer.parseInt(value.replace("String_", ""));
                    } catch (NumberFormatException e) {
                        e.printStackTrace(System.out);
                        return -1;
                    }
                }), new UnaryOperator<>() {
                    private int result = 0;
                    @Override
                    public Integer apply(Integer integer) {
                        if (integer > 0){
                            result += integer;
                        }
                        return result;
                    }
                }
        ).get());
    }

}
