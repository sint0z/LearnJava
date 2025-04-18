package shzeproject.generics.ship;

import java.util.ArrayList;

public class Container extends ArrayList<Box>{
    
    public Container(int nBox, int nProduct){
        for (int i = 0; i < nBox; i++) {
            add(new Box(nProduct));
        }
    }

    
    public static void main(String[] args) {
    }
}
