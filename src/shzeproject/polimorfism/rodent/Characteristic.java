package shzeproject.polimorfism.rodent;

import java.util.ArrayList;

public class Characteristic {
    private int refCount = 0;
    private ArrayList<String> characteristics = new ArrayList<>();

    public Characteristic(String character){
        characteristics.add(character);
        System.out.println("Characteristic " + character + " init");
    }

    public void addRef(){
        refCount++;
    }
    
    public int getRefCount() {
        return refCount;
    }
    
    public ArrayList<String> getCharacteristic(){
        return characteristics;
    }
}
