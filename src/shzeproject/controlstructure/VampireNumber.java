package shzeproject.controlstructure;

import java.util.ArrayList;

public class VampireNumber {
    public static final int MIN_NUMBER = 1000;
    public static final int MAX_NUMBER = 9999;

    static String convertAndSortInteger(int... numbers){
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int number : numbers){
            while(number > 0){
                list.add(number % 10);
                number /= 10;
            }   
        }


        StringBuilder buffer = new StringBuilder();
        list.stream().sorted().forEach(buffer::append);
        
        return buffer.toString();
    }

    static boolean isVampireNumber(int number){

        for(int first = 10; first < 99; first++){
            for (int second = first; second < 99; second++) {
                
                if(isEndZeroDigit(first) && isEndZeroDigit(second)){
                    continue;
                }

                if(first * second == number){
                    
                    String i = convertAndSortInteger(number);
                    String j = convertAndSortInteger(first, second);
                   
                    if(i.equals(j)){
                        return true;
                    }

                }
            }
        }

        return false;
    }

    static boolean isEndZeroDigit(int num){
        return num % 10 == 0;
    }
    static ArrayList<Integer> getVampireNumber(){
        ArrayList<Integer> listNumber = new ArrayList<>();
        for(int num = MIN_NUMBER; num < MAX_NUMBER; num++){
            if(isVampireNumber(num)){
                listNumber.add(num);
            }
        }

        return listNumber;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = getVampireNumber();
        list.stream().forEach(System.out::println);
    }
}
