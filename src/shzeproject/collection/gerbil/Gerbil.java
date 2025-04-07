package shzeproject.collection.gerbil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Gerbil {
    public static final Random RANDOM = new Random();
    private int gerbilNumber;

    public Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    };

    public void hop(){
        System.out.println("hop(" + gerbilNumber + ")");
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbilList = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            gerbilList.add(new Gerbil(RANDOM.nextInt(50)));
        }

        Iterator<Gerbil> iterator = gerbilList.iterator();

        while(iterator.hasNext()){
            iterator.next().hop();
        }
        
    }
}
