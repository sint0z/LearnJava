package shzeproject.generics.generator;

/*
 * Реализация генератора чисел Фибоначчи, используя генератор
 */
public class Fibonacci implements Generator<Integer> {
    private int counter;

    private int fib(int num){
        if(num < 2) {
            return 1;
        }
        return fib(num - 2) + fib(num - 1);
    }

    @Override
    public Integer next() {
        return fib(counter++);
    }
}
