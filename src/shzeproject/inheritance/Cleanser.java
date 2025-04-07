package shzeproject.inheritance;

class Cleanser {
    private String str = "Cleanser ";

    public String append(String str){
        return this.str += str;
    }
    public void scrub(){System.out.println("scrub()");}
    public void apply(){System.out.println("apply()");}
    public void dilucte(){System.out.println("dilucte()");}

    @Override
    public String toString() {
        return str;
    }
    
}
