package shzeproject.access_control;

/* 
 * Для переключения между версиями отладки необхоимо раскомментировать
 * одну строку и закоментировать вторую
*/
import static shzeproject.access_control.debug.Debug.*;
//import static shzeproject.access_control.debugoff.Debug.*;


import shzeproject.access_control.protect.ProtectedTest;




public class AccessControlMain {
    public static void main(String[] args) {
        debug("Hello world");
        ProtectedTest test = new ProtectedTest();
        
    
    }
    
}
