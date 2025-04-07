package shzeproject.inheritance.swim_entity;

public class Amphibian {
    private String name;

    protected  Amphibian(){}

    protected static void displayName(Amphibian amphibian){
       String name = amphibian.getName();
       System.out.println("Имя это амфибии - " + name);
    }
    
    protected void setAmphibianName(String name){
        this.name = name;
    }

    protected String getName(){
        return name;
    }
}
