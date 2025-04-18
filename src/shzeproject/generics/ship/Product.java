package shzeproject.generics.ship;

import java.util.Random;

import shzeproject.generics.generator.Generator;

public class Product {
    private final long code;
    private String description;
    private double weight;

    public Product(long code, String descript, double weight ){
        this.code = code;
        this.description = descript;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("[%-1d] --> <\'%s\'>, weight: %.2f", code, description, weight);
    }

    

    public static Generator<Product> generator(){
        return new Generator<Product>() {
            private Random rand = new Random();

            @Override
            public Product next() {
                return new Product(rand.nextLong(1000), "Product", rand.nextDouble(5));
            }
            
        };
    }
}
