package shzeproject.operators;

import java.util.*;

public class TestOne {

    public static void notInterestingFunction(OneFloat fl) {
        fl.thisIsFloatNumber = 1.34567f;
    }

    public static void print(Object o){
         System.out.println(o.toString());
    }

    public static void main(String[] args) {
        print("Привет сегодня: ");
        print(new Date());


        OneFloat numb1 = new OneFloat();
        OneFloat numb2 = new OneFloat();

        numb1.thisIsFloatNumber = 1.5f;
        numb2.thisIsFloatNumber = 2.5f;

        print("Это вызов до совмещения имен");
        print(numb1.getFloatNumber());
        print(numb2.getFloatNumber() + "\n");
        
        numb1 = numb2;

        print("Это вывод при совмещении имен");
        print(numb1.getFloatNumber());
        print(numb2.getFloatNumber());


        OneFloat numb3 = new OneFloat();
        numb3.thisIsFloatNumber = 10.5f;
        print(numb3.getFloatNumber());
        notInterestingFunction(numb3);
        print(numb3.getFloatNumber());

   }
}
