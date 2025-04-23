package shzeproject.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class CovariantArrays {

    public static void main(String[] args) {
        /*
         * Массивы ковариантны, т.к в данном случае, JVM (ядро времени выполнения),
         * во время выполнения знает, что мы имеем дело с массивом объектов Integer
         * */
        Number[] numberArray = new Integer[10];

        numberArray[0] = 1;
        numberArray[1] = 2;

        /*
         * Невозможно выполнить, т.к во времени выполнения (исполнения), JVM ожидает Integer, a не Float
         * поэтому в нынешней версии компилятора, нам укажут на возможную ошибку, и если ее не исправить,
         * получим исключение.
         */
        try {
            //numberArray[2] = 1.5f;
        }catch (ArrayStoreException ex){
            ex.printStackTrace(System.out);
        }

        ArrayList<Integer> intList = new ArrayList<>();
        //List<Number> numbersList = intList;
        /*
        * В данном случае List<Number> - ожидает объект со элементами, Number или производными,
        * но мы присваиваем ему объект ArrayList<Integer> - c элементами Integer,
        * поэтому List<Number> может содержать объекты именно типа Number или его подклассов
        * но при этом он не является супер классом для списков с более узкими типами (ArrayList<Integer>)
        * */

        List<? extends Number>  numbersList = intList;
        /*
        * Это список неизвестного типа, который гарантированно является либо Number, либо его подклассом.
        * Такой wildcard позволяет принимать на вход списки любых подтипов Number, и работать с ними как с Number.
        */

        // Ошибка во времени компиляции, мы точно не знаем тип который будет храниться
        // numbersList.add(Integer.valueOf(1));

        Number number = numbersList.getFirst(); // компилятор точно знает, что возвращается как минимум Number


    }
}
