package shzeproject.operators;

public class BitwiseOperation {

    private static int i = 1;

    public  static void printFormattedData(int arg){
        System.out.println((i++) + "- число в 10-ой форме: " + arg + "\n" + "в 2-ой форме: " + Integer.toBinaryString(arg) + "\n");
    }

    public static void main(String[] args) {
        int num1 = 0x1F;
        int num2 = 0x55;


        printFormattedData(num1);
        printFormattedData(num2);

        System.out.println("------------------------------");
        System.out.println("Оператор &");
        printFormattedData(num1&num2);

        System.out.println("Оператор |");
        printFormattedData(num1|num2);

        
        System.out.println("Оператор ^");
        printFormattedData(num1^num2);

        System.out.println("Оператор ~");
        printFormattedData(~num2);

       
    }
}
