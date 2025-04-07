package shzeproject.inner_class.inner_class_four;

public class ZooPark {

    private class Monkey implements Animal{

        public void sleep(){
            System.out.println("Monkey sleep");
        }

        @Override
        public void voice() {
            System.out.println("Monkey say - yaaa yaaa!");
        }
    }

    public Animal getAnimal(){
        class Bird implements Animal{

            @Override
            public void voice() {
               System.out.println("Чирик чирик!");
            }

        }
        return new Bird();
    }

    public Animal getAnimal(String name){
        
        if(!name.isEmpty()){
            class Bear implements Animal{
                private String name;

                public Bear(String name){
                    this.name = name;
                }

                @Override
                public void voice() {
                    System.out.println("Bear <" + name + "> - rrrrrrrrr!");
                }
            }

            return new Bear(name);
        }
        return getAnimal();
    }

    public Animal getMonkey(){
        return new Monkey();
    }

    public Animal getPig(){
        /*
        * Возможна интерпритация для интерфейса с 1 методом. используя лямда выражение
        * return () -> { System.out.println("Pig say: Xry Xry@");}
        */ 
        return new Animal() { 

            @Override
            public void voice() {
               System.out.println("Pig say: Xry Xry@");
            }
            
        };
    }

    public static void main(String[] args) {
        ZooPark park = new ZooPark();
        Animal bird = park.getAnimal();
        bird.voice();

        Animal bear = park.getAnimal("Fraddy");
        bear.voice();

        Animal monkey = park.getMonkey();
        monkey.voice();
        // Monkey monkey1 = (Monkey)monkey;
        // monkey1.sleep();

        Animal pig = park.getPig();
        pig.voice();
    }
}
