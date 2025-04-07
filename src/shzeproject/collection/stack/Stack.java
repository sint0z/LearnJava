package shzeproject.collection.stack;

import java.util.LinkedList;

public class Stack<T> {
    private final LinkedList<T> storage = new LinkedList<>();

    public void push(T item){
        storage.addFirst(item);
    }

    public T peek(){
        return storage.getFirst();
    }

    public T pop(){
        return storage.removeFirst();
    }

    public boolean isEmpty(){
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";

        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);

            if(c == '+'){
                if(i + 1 < str.length()){
                    stack.push(str.charAt(i + 1));
                    i++;
                }
            }else if (c == '-'){
                if(!stack.isEmpty()){
                    System.out.print(stack.pop());
                }
            }
        }
        
        
    }
}