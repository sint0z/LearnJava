package shzeproject.controlstructure;

import java.util.Random;

public class ControlStructures {

   static  int getInteger(){
        Random random = new Random(47);
        int number = random.nextInt();
        if (number > 4){
            return number;
        }

        return 0;

    }
    

    /*
     * Задание 1:
     * Напишите программу, которая выводит числа от 1 до 100 
     */
    public static void displayHundredNumber(){
        System.out.println("Числа от 1 до 100:");
        for (int i = 1; i < 100 + 1; i++) {
            String separator = " ";

            if(i < 100){
                separator = ",";
            }
            System.out.print(i + separator);
        }

    }
    
    /*
     * Задание 2:
     * Напишите программу, которая генерирует 25 случайных значений типа int.
     * Для каждого значения команда if-else сообщает, в каком отношении оно находится
     * с другим случайно сгенерированным числом. 
     */
    public static void displayRandomNumber(){
        Random random = new Random(47);
        int prev = -1; 
         for (int i = 0 ;i < 25; i++){
            int current = random.nextInt(100);
            System.out.println("Число № " + i + " сгенерировано: " + current);
            if(prev != -1){
               if(current == prev) {
                 System.out.println(current + " = " + prev);
               }else if(current > prev){
                 System.out.println(current +  " > " +  prev);
               } else {
                System.out.println(current +  " < " +  prev);
               }
            }
            prev = current;
             
         }
    }


    public static void displayPrimeNumber(){
        System.out.println("Вывод простых чисел:");
        int maximum = 100;
        for (int num = 2; num < maximum; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
               if(num % i == 0){
                    isPrime = false;
                    break;
               }
            }

            if(isPrime){
                System.out.print(num + " ");
            }
        }
    }

    public static  String toBinaryStringCustom(int number){
        String binary = " ";
        for (int i = 31; i > 0; i--) {
            binary += (number & (1 << i)) !=0 ? 1 : 0;
        }

        return binary;
    }

    public static void main(String[] args) {
          displayHundredNumber(); // Вызов метода для задания 1
          displayRandomNumber(); // Вызов метода для задания 2
          System.out.println(" ");
          displayPrimeNumber();
          System.out.println(" ");
          System.out.println(toBinaryStringCustom(64));

         
    }
}
