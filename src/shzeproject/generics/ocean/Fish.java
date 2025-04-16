package shzeproject.generics.ocean;

public abstract class Fish {
    protected int size;

    public Fish(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " (размер: " + size + " ) ";
    }

    
}
