package shzeproject.inheritance.reusing;

public class Pig extends Entity{

    public Pig(String name, int xp) {
        super(name, xp);
    }

    void takeDamage(String damageInfo) {
        System.out.println(damageInfo);
    }

    public static void main(String[] args) {
        Pig PIG = new Pig("Pigga", 1000);
        PIG.getStats();
        PIG.takeDamage("Прилетело так знатно 0 ");
        PIG.takeDamage(100);
        PIG.takeDamage(114L);
        PIG.takeDamage(134.5F);
    }
}
