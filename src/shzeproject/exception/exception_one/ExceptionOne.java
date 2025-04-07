package shzeproject.exception.exception_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExceptionOne {

    public static String[] exception(int size){

        try{
            if(size > 10) throw new ArrayIndexOutOfBoundsException("Size is very big!");
        } catch(ArrayIndexOutOfBoundsException e){
            throw new RuntimeException(e);
        }

        String [] strings = new String[size];

        for (int i = 0; i < 10; i++) {
            strings[i] = "String" + String.valueOf(i);
        }
        
        return strings; 
    }

    public ExceptionOne() {
        exception(10);
    }
    


    public static void main(String[] args){

        //Задание 1 - Глава 12
        String str = "Null";
        try{
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()){
                throw new Exception("Вы ввели число!");
            }

             str = scanner.next();
             scanner.close();
            
        }catch(Exception e){
            e.printStackTrace(System.out);
        }finally{
            if("Null".equals(str)){
                System.out.println(str + " <- Строчка пустая, но я сработал =)");
            }
            
        }


        //Задание 2 - Глава 12, 
        /*
         * ArrayList<String> list = null;
         * list.add("Да будет исключение");
         */

        try {
            ArrayList<String> list = null;
            list.add("Да будет исключение");
        } catch (Exception e) {
        }

        //Задание 3 - Глава 12: Модифицировано -> Задание 6 (стр. 376)
       
        try {
            String[] string = exception(11);
            System.out.println(string.length);
        } catch (RuntimeException e) {
            try {
                throw e.getCause();
            } catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("<Exception>: --> " + e.getMessage());
            } catch (Throwable ex) {
                System.out.println("<Exception>: --> " + e.getMessage());
            }
           
        }finally{
            System.out.println("А я до сих пор работаю = )");
        }

        //Задание 4 - Глава 12
      
        int age = 10;
        if(age < 18) throw new SimpleException("Мелкий еще иди отсюда");
        

        String[] strings = null;
        int size = 15;
        while (true) { 
            try {
                strings = exception(size);
                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Size:" + size + " -> is very big, I'm reducing");
                size--;
            }finally{
                if(strings != null){
                    System.out.println("Ooo size: " + size + " -> is correct!");
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(strings));


        // Задание 5 - Глава 12 (стр. 376)
        try {
            String tell = null;
            if(tell == null){
                throw new TellingException("Немножечко кретины");
            }
        } catch (TellingException e) {
        }
    }
}
