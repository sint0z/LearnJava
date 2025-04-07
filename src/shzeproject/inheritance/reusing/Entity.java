package shzeproject.inheritance.reusing;

class Entity {
    
    private int xp;
    private int mana;
    private String name;

    public Entity(String name, int xp) {
        this.name = name;
        this.xp = xp;
    }

    protected void takeDamage(int damage){
        xp -= damage;
        mana += damage / 10;
        getStats();
    }

    protected void takeDamage(long damage){
        xp -= damage;
        mana += (int) (damage % 10);
        getStats();
    }
    protected void takeDamage(float damage){
        xp -= damage;
        mana += (int) (damage % 10);
        getStats();
    }

    protected void getStats(){
        System.out.println(name + " имеет: xp - " + xp + " и mana - " + mana);
    }
}
