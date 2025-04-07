package shzeproject.operators;

public class Dog {
    String name;
    String says;

    public void setName(String name) {
        this.name = name;
    }

    public void setSays(String says) {
        this.says = says;
    }

    public void getInformation(){
        System.err.println("Его имя: "+ this.name + "\n" + "Он сказал: " + this.says);
    }


    
}
