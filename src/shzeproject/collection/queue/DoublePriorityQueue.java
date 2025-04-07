package shzeproject.collection.queue;

import java.util.PriorityQueue;
import java.util.Random;

public class DoublePriorityQueue {
    public static void main(String[] args) {
        Random random = new Random();
        PriorityQueue<Double> queue = new PriorityQueue<>();
        
        for(int i = 0; i < random.nextInt(2,30); i++){
            queue.offer(random.nextDouble(25));
        }
        
        while (!queue.isEmpty()) {
            Double number = queue.poll();
            
            if(number != null){
                System.out.println(number);
            }
            \
        }
    }
}
