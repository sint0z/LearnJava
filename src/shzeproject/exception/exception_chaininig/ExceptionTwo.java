package shzeproject.exception.exception_chaininig;

import shzeproject.exception.exception_one.SimpleException;
import shzeproject.exception.exception_one.TellingException;

public class ExceptionTwo {
    public void g() throws TellingException{
        throw new TellingException("New Exception");

    }
    
    public void f() throws SimpleException{
        try{
           g(); 
        }
        catch(Exception e){
            System.out.println("Я открылся");
            SimpleException sException =  new SimpleException("Новый !");
            sException.initCause(e);
            throw sException;
        }
    }

    public static void main(String[] args) {
        ExceptionTwo eTwo = new ExceptionTwo();
        try {
            eTwo.f();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
