package shzeproject.interface_and_abstraction.series_char;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdapterCharSeries extends CharSeriesGenerator implements Readable{
    private int count;

    public AdapterCharSeries(int count){
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0){
            return -1;
        }

        String result = Character.toString(generate()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new AdapterCharSeries(3));
        while (scanner.hasNext()) {
            System.out.print(scanner.next() + " ");
            
        }
        
        // Упражнение 14 из главы 10 - "Внутреннии классы"
        Scanner scanner1 = new Scanner(new Readable() {
            private int count = 5;
            private final CharSeriesGenerator charSeriesGenerator = new CharSeriesGenerator(); 
            
            @Override
            public int read(CharBuffer cb) throws IOException {
                if(count-- == 0){
                    return -1;
                }
        
                String result = Character.toString(charSeriesGenerator.generate()) + " ";
                cb.append(result);
                return result.length();
            }

        });


        System.out.println("\n\nNew char:");
        while (scanner1.hasNext()) {
            System.out.print(scanner1.next() + " ");
        }
    }

}
