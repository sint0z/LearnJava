package shzeproject.generics.ship;

import java.util.ArrayList;

import shzeproject.generics.Generators;

public class Box extends ArrayList<Product> {
    public Box(int boxSize){
        Generators.fill(this, Product.generator(), boxSize);
    }
}
