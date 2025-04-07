package shzeproject.initialization_and_completion;

public class Overloading {

    
    static void println(String strs){
        System.out.println(strs);
    }

    public void getInfo(int number){
        println(Integer.toString(number));
    }
    public Overloading() {
        println("Hello World!");
    }

    public Overloading(String name){
        println("Say my name! " + name);

    }

    public static void main(String[] args) {
        Overloading obj1 = new Overloading();
        Overloading obj2 = new Overloading("Nikita");

    }
  
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

  
}   
