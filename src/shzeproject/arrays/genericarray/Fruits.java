package shzeproject.arrays.genericarray;

import java.util.ArrayList;
import java.util.List;

public class Fruits {
    private static final int INIT_ARRAY_SIZE = 10;

    //Peel<Banana>[] bananasInPeel = new Peel[10]; - компилятор выдает предупреждение
    List<Peel<Banana>> bananasInPeel = new ArrayList<>(); //  - в данном примере все корректно, проверка на стадии компиляции

    public Fruits() {
        for (int i = 0; i < INIT_ARRAY_SIZE; i++) {
            bananasInPeel.add(new Peel<>(new Banana("African Yellow " + i, 4)));
        }
    }

    public void print(){
        for(Peel<Banana> peel : bananasInPeel){
            Banana banana = peel.clearPeel();
            System.out.println(banana.getType());
        }
    }
    public static void main(String[] args) {
        Fruits fruits = new Fruits();
        fruits.print();
    }
}
