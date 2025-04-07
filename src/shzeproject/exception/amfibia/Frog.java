package shzeproject.exception.amfibia;


class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        System.out.println("Characteristic: " + s);
    }

    protected void dispose() {
        System.out.println("Disposing Characteristic: " + s);
    }
}

class Description {
    private String s;

    Description(String s) {
        this.s = s;
        System.out.println("Description: " + s);
    }

    protected void dispose() {
        System.out.println("Disposing Description: " + s);
    }
}

// Living creature
class LivingCreature {
    private Characteristic p = new Characteristic("This is a living creature");
    private Description t = new Description("Description of a living creature");

    LivingCreature() {
        System.out.println("LivingCreature()");
    }

    protected void dispose() {
        System.out.println("dispose() in LivingCreature");
        t.dispose();
        p.dispose();
    }
}

// Animal
class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("Has a heart");
    private Description t = new Description("Not a plant");

    Animal() {
        System.out.println("Animal()");
    }

    protected void dispose() {
        System.out.println("dispose() in Animal");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

// Amphibian
class Amphibian extends Animal {
    private Characteristic p = new Characteristic("Can live in water");
    private Description t = new Description("Lives in water and on land");

    Amphibian() {
        System.out.println("Amphibian()");
    }

    protected void dispose() {
        System.out.println("dispose() in Amphibian");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

// Frog
public class Frog extends Amphibian {
    private Characteristic p = new Characteristic("Catches insects");
    private Description t = new Description("Eats bugs");

    public Frog() {
        System.out.println("Frog()");
    }

    protected void dispose() {
        System.out.println("Disposing Frog");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        try {
            System.out.println("Работа с объектом...");
            if (Math.random() > 0.5) {
                throw new RuntimeException("Исключение в середине работы!");
            }
            System.out.println("Finished!");
        } catch (Exception e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        } finally {
            System.out.println("\nВызов завершающих действий:");
            frog.dispose();
        }
    }
    
}