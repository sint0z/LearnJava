package shzeproject.string;

import java.util.Arrays;

public class StringFormat {
    private int intNumber;
    private long longNumber;
    private float floatNumber;
    private double doubleNumber;

    public StringFormat(int intNumber, long longNumber, float floatNumber, double doubleNumber) {
        this.intNumber = intNumber;
        this.longNumber = longNumber;
        this.floatNumber = floatNumber;
        this.doubleNumber = doubleNumber;
    }

    @Override
    public String toString() {
        
        
        return String.format("This is | %1$2d | %2$,5d | %3$-5.2f | %4$-5.1e |" , intNumber, longNumber,floatNumber, doubleNumber);
    }

    public static void main(String[] args) {
        StringFormat str = new StringFormat(156, 16442134l,
                                             123.456456756f, 84746.0934571d);

        System.out.println(str);

        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(input.split("!!")));
        System.out.println(Arrays.toString(input.split("!!",2)));
    }

    
}
