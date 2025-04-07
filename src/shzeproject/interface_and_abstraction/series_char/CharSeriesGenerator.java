package shzeproject.interface_and_abstraction.series_char;

import java.util.Random;

public class CharSeriesGenerator {
    private final char[] CHAR_SET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890".toCharArray();
    private final Random random = new Random();

    public char generate(){
        int length = CHAR_SET.length;
        return CHAR_SET[random.nextInt(length)];
    }

    public static void main(String[] args) {
        CharSeriesGenerator charSeriesGenerator = new CharSeriesGenerator();
        System.out.println(charSeriesGenerator.generate());
    }
}
