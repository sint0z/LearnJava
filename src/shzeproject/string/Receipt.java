package shzeproject.string;

import java.util.Formatter;

public class Receipt {
    private static final int BASE_WIDTH = 10; 
    
    private static final int ITEM_WIDTH = BASE_WIDTH * 3;  
    private static final int QTY_WIDTH = BASE_WIDTH * 1;  
    private static final int PRICE_WIDTH = BASE_WIDTH * 2; 
    
    private double total = 0;
    private final Formatter formatter = new Formatter(System.out);
    
    public Receipt() {

    }

    public void printTitle(){
        formatter.format("%-" + ITEM_WIDTH + "s %-" + QTY_WIDTH + "s %-" + PRICE_WIDTH + "s\n", 
                        "Item", "Qty", "Price");
        formatter.format("%-" + ITEM_WIDTH + "s %-" + QTY_WIDTH + "s %-" + PRICE_WIDTH + "s\n", 
                        "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        formatter.format("%-" + ITEM_WIDTH + ".15s %-" + QTY_WIDTH + "d %-" + PRICE_WIDTH + ".2f\n", 
                        name, qty, price);
        total += price;
    }

    public void printTotal() {
        formatter.format("%-" + ITEM_WIDTH + "s %-" + QTY_WIDTH + "s %-" + PRICE_WIDTH + ".2f\n", 
                        "Tax", "", total * 0.06);
        formatter.format("%-" + ITEM_WIDTH + "s %-" + QTY_WIDTH + "s %-" + PRICE_WIDTH + "s\n", 
                        "", "", "-----");
        formatter.format("%-" + ITEM_WIDTH + "s %-" + QTY_WIDTH + "s %-" + PRICE_WIDTH + ".2f\n", 
                        "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Milk", 2, 4.9999);
        receipt.print("Bread", 10, 14.2659);
        receipt.print("Chocolate", 5, 100f);
        receipt.printTotal();
    }
}
