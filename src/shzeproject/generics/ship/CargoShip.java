package shzeproject.generics.ship;

import java.util.ArrayList;

public class CargoShip extends ArrayList<Container>{

    public CargoShip(int nContainer, int nBox,int nProduct){
        for(int i = 0; i < nContainer; i++){
            add(new Container(nBox, nProduct));
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(Container container : this){
            for(Box box : container){
                for(Product prod : box){
                    builder.append(prod);
                    builder.append("\n");
                }
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new CargoShip(3, 5, 10));
    }
}
