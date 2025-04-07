package shzeproject.string;

import java.util.ArrayList;
import java.util.List;

public class InfinityRecursion {

    @Override
    public String toString() {
        // Использование this в данном случае приводит к рекурсивному вызову toString(); 
        return "Adress class: " + super.toString();
    }
    public static void main(String[] args) {
        List<InfinityRecursion> listInfinity = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            listInfinity.add(new InfinityRecursion());
        }

        System.out.println(listInfinity);

    }
}
