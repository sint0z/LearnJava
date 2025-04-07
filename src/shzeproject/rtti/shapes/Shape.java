package shzeproject.rtti.shapes;

public abstract class Shape {
    private boolean highlighted = false;

    public void draw(){
        System.out.println(this + ".drow()" + "hightLight: [" + highlighted + "]");
    }

    public boolean isHighLight(){
        return highlighted;
    };

    public void setHightLight(boolean highlighted){
        this.highlighted = highlighted;   
    }

    public abstract void rotate();

    @Override
    public String toString(){
        return String.format("Object: [%s] -> highlite: [%b]\n", this.getClass().getSimpleName(), highlighted);
    };
}
