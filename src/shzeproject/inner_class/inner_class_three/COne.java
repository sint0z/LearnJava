package shzeproject.inner_class.inner_class_three;

import java.lang.classfile.Superclass;

public class COne {
    private String str;
    private void stringMethod(){
        System.out.println("Say: Hello World !");
    }

    public COne(String str){
        this.str = str;
    }

    public class CInnerOne{
        private void innerPrivateMethod(){
            System.out.println("I am private inner class method");
        }
        public void useOther(){
            
            str = "New String";

            stringMethod();
        }
    }

    /*
     * Упражнение 10, анонимный класс
     */
    public CInnerOne getCInnerOne(){
        return new CInnerOne(){
            @Override
            public void useOther() {
                str = "New Anonimus Class";
                super.innerPrivateMethod();
            }
        };
    }

    public void demonstrateOne(){
        // не можем вызывать innerPrivateMethod() - т.к он являеться приватным 
        System.out.println("До изменениия -> " + str);
        CInnerOne ci = new CInnerOne();
        ci.useOther();
        System.out.println("После изменениия -> " + str);   
    }


    /*
     * Упражнение 10, анонимный класс
     */
    public void demonstrateTwo(){
        System.out.println("До изменениия -> " + str);
        CInnerOne ci = getCInnerOne();
        ci.useOther();
        System.out.println("После изменениия -> " + str);   
    }


    public static void main(String[] args) {
        COne cOne = new COne("Start String");
        cOne.demonstrateOne();
        cOne.demonstrateTwo();
    }
}
