package shzeproject.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Command {
    private String command;

    public Command(String command){
        this.command = command;
    }

    public void operation(){
        System.out.println(command);
    }

    public static void main(String[] args) {
        Queue<Command> queue = new LinkedList<>();

        for(int i = 0; i < 10; i++){
            String commandText = "/command + " + String.valueOf(i);
            queue.offer(new Command(commandText));
        }

        System.out.println(queue);

       while (!queue.isEmpty()) {
           Command command = queue.poll();
           if(command != null){
                command.operation();
           }
           
       }
    }
}
