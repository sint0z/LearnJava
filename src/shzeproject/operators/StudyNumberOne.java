package shzeproject.operators;

/** Комментарий к классу */
public class StudyNumberOne {

    /** Комментарий к переменной класса */
    public int i = 1;
    public char c;

    /** Комментарий к методу класса\
     * @param args - Параметр вводимый в данную функцию
     * @see TestOne
     */
    public int function(String args){
        return args.length();
    };


    public static void main(String[] args) {
       StudyNumberOne one = new StudyNumberOne();
       System.out.println(one.function("Бла бла"));
        
       int s,t;
       s = 100;
       t = 15;
       float v = s/t;
       TestOne.print("Скорость равна " + v);


       Dog spot = new Dog();
       spot.setName("Georgiy");
       spot.setSays("This is SPAAARTA!!!");

       Dog scruffy = new Dog();
       scruffy.setName("Valentin");
       scruffy.setSays("Hello World dudes!");

       Dog korgi = spot;
       
       TestOne.print(spot == korgi);
       TestOne.print(spot.equals(korgi));






    }
}
