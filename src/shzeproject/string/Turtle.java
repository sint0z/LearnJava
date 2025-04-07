package shzeproject.string;

import java.io.PrintStream;
import java.util.Formatter;
import java.util.Random;

public class Turtle {
    private final Formatter formatter;
    private final String name;

    public Turtle(String name, Formatter formatter){
        this.formatter = formatter;
        this.name = name;
    }

    public void move(int x, int y){
        formatter.format("Turtle: <%s> --> is at (%d, %d)\n", name, x,y);
    }

    public static void main(String[] args) {
        Random random = new Random();
        PrintStream systemError = System.err;


        Turtle tommy = new Turtle("Tommy", new Formatter(System.err));
        Turtle tommyCash = new Turtle("Tommy Cash", new Formatter(systemError));

        for(int i = 0; i < 10; i++){
            tommyCash.move(random.nextInt(11 - i), random.nextInt(11 - i));
            tommy.move(random.nextInt(i + 1), random.nextInt(i + 2));
        }

    }
}
