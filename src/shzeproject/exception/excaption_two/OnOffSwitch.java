package shzeproject.exception.excaption_two;

public class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void exception() 
        throws OffException, OnException{   
       //throw new RuntimeException("Runtime Exception");
    }

    @SuppressWarnings("finally")
    public static String returned(Integer i){
        try{
            if(i == 1) return "String " + String.valueOf(i);
            if(i == 2) return "String " + String.valueOf(i);
            if(i == 3) return "String" + String.valueOf(i);

        }finally{
            return "String null";
        }
    }

    public static void main(String[] args) {
        try {
            sw.on();
            exception();
            //sw.off(); -> без блока finally
        } catch (OffException | OnException e) {
            e.printStackTrace(System.out);
            //sw.off(); -> без блока finally
        } finally{
            sw.off();
        }


        System.out.println(returned(1));
    }

}
