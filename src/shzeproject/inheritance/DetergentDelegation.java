package shzeproject.inheritance;

public class DetergentDelegation  {
    String brand;
    Cleanser cleanser = new Cleanser();
    
    public DetergentDelegation(String brand){
        this.brand = brand;
    }
    
    public String append(String str){
       return cleanser.append(str);
    }
    public void scrub(){
        cleanser.scrub();
    }
    public void apply(){
        cleanser.apply();
    }
    public void dilucte(){
        cleanser.dilucte();
    }

    @Override
    public String toString() {
        return brand;
    }
    
    
    public static void main(String[] args) {
        DetergentDelegation detergentDelegation = new DetergentDelegation("Doctor Cleaner");
        System.out.println(detergentDelegation.append("main()"));
    }
}
