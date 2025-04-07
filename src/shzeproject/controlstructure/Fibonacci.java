package shzeproject.controlstructure;

import java.util.Arrays;

public class Fibonacci {
    static int[] getFibonacciArray(int n){
        int[] arr = new int[n];

        int next, prev;
        prev = next = 1;

        for(int i = 0; i < n; i++){
            arr[i] = prev;
            
            int current = prev + next;
            prev = next;
            next = current;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = getFibonacciArray(5);

        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }

}
