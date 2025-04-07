package shzeproject.exception.exception_three;

public class DerivedClassEx extends BaseClassEx {

    public DerivedClassEx(int size) throws ExceptionInInitializerError {
        /*
         *  try{
         *    super(size); 
         * }cath(ExceptionInInitializerError e){
         *    e.printStackTrace(System.out)
         * }
         * 
         * Данное действие не сработает в виду ограничения исключений,
         * вызов конструктора базового класса должен быть первой строчкой / командой
         * в конструкторе производного класса.
         * Из-за таких ограничений невозможно перехватить исключения, возбуждаемые базовым классом
         */
        super(size);
    }

    public static void main(String[] args) {
        
        try {
            DerivedClassEx derivedClassEx = new DerivedClassEx(-1);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    

}
