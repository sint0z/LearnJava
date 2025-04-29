package shzeproject.generics.problems.genericcast;

public class GenericCast {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        FixSizeStack<String> strings = new FixSizeStack<>(SIZE);
        FixSizeStackArrayList<String> fixStackArray = new FixSizeStackArrayList<>(SIZE);

        for(String s : "A B C D E F G H I J".split(" ")){
            strings.push(s);
            fixStackArray.push(s);
        }

        System.out.println("FixSizeStack -> " + strings.size());
        System.out.println("FixSizeStackArrayList -> " +fixStackArray.size());

        for (int i = 0; i < SIZE; i++) {
            String string = strings.pop();
            System.out.println(string);
        }

    }
}
