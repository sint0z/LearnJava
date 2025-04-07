package shzeproject.operators;

public class ShiftOperation {

    public static void charToBinary(char ch){
        System.out.println("Вы ввели символ = "+ ch);
        String binary = Integer.toBinaryString(ch);
        System.out.println("В двоичной системе = " + binary);
    }
    public static void main(String[] args) {
        int binaryConstant = 0x80000000;
        System.out.println(Integer.toBinaryString(binaryConstant));

        for (int i = 0; i < 32; i++) {
            binaryConstant >>= 1;
            System.out.println(i + "  - операция =  " + Integer.toBinaryString(binaryConstant));
            
        }


        System.out.println("_______________________________________________________");
        int binaryConstantTwo = 0xFFFFFFF;
        System.out.println("Изначальное число: " + Integer.toBinaryString(binaryConstantTwo));

        binaryConstant <<= 1;
        System.out.println("Cдвинули на 1 знак слева: "+ Integer.toBinaryString(binaryConstantTwo));

        for (int i = 0; i < 27; i++) {
            binaryConstantTwo >>>= 1;
            System.out.println(i + " - операция =  " + binaryConstantTwo + " = " + Integer.toBinaryString(binaryConstantTwo));
            
        }
        
        charToBinary('x');
        charToBinary('b');

    }
}
