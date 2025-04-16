package shzeproject.generics.tuple;

import static shzeproject.generics.tuple.Tuple.*;

public class TestTuples2 {

    public static TupleTwo<String,Integer> fun1(){
        return tuple("String 1", 1);
    }
   
    /* 
     * Компилятор выдает сообщение: 
     * TupleTwo is a raw type. References to generic type TupleTwo<A,B> should be parameterized
     * Это означает, что при компиляции мы получим предупрежение, т.к невозможно компилятору,
     * провести проверку на безопасность типов. 
     * В данный кортеж по идее можно добавить что угодно, любой тип, но ошибка будет при извлечении.
     */
    public static TupleTwo fun2(){
        return tuple("String 1.1", 1);
    }
    
    public static ThreeTuple<String,Integer,Integer> fun3(){
        return  tuple("String 3", 1, 2);
    }

    public static FourTuple<String,Integer,Integer,Integer> fun4(){
        return tuple("String 4", 1, 2, 3);
    }
    
    public static FiveTuple<String,Integer,Integer,Integer,Integer> fun5(){
        return tuple("String 5", 1, 2, 3, 4);
    }

    public static SixTuple<String,Integer,Integer,Integer,Integer,Integer> fun6(){
        return  tuple("String 6", 1, 2, 3, 4, 5);
    }

    /* 
     * Резултат работы:
     * | String 1 | 1 | 
     * | String 1.1 | 1 | - это метод fun2() -> он работает, но он не безопасен!
     * | String 3 | 1 | 2 |
     * | String 4 | 1 | 2 | 3 |
     * | String 5 | 1 | 2 | 3 | 4 |
     * | String 6 | 1 | 2 | 3 | 4 | 5 | 
     * 
     */
    public static void main(String[] args) {
        System.out.println(fun1());
        System.out.println(fun2()); // ! Работает, но не безопасен
        System.out.println(fun3());
        System.out.println(fun4());
        System.out.println(fun5());
        System.out.println(fun6());

    }
}
