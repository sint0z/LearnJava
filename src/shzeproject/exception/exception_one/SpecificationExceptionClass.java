package shzeproject.exception.exception_one;

import java.util.Random;

public class SpecificationExceptionClass {

    public static int method() throws SimpleException{
        int i = new Random().nextInt(10);
        
        if(i == 0) throw new SimpleException("int is 0");
        return i;
    }

    public static void fatalException(Integer size) throws SimpleException, TellingException, ArrayStoreException{
        if(size > 10) throw new ArrayStoreException("ArrayStoreException");
        if(size == 0) throw new SimpleException();
        if(size > 5 && size < 9) throw new TellingException("Oioioioi");
    }

    @SuppressWarnings("UseSpecificCatch")
    public static void main(String[] args) {
        int i = -1;
        try {
            /*
             * Метод выбрасывает (возбуждает) исключение и 
             * если явно не указать спецификацю исключения (trows) или не обработать его компилятор выдаст ошибку:
             * java.lang.Error ->  Unhandled exception type SimpleException
             */ 
            i = method();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }


        //Задание 9 - Глава 12 (стр. 378)
        System.out.println("--------------------e");
        try {
            fatalException(null);
        } catch (Exception e) {
            if(!(e instanceof TellingException)){
                e.printStackTrace(System.err);
            }
        } finally{
            System.out.println("Я все равно работаю");
        }
    }
}
