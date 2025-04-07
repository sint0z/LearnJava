package shzeproject.inner_class.sequence;

import shzeproject.inner_class.Other;

public class OtherOne {
    private String str;
 
    public OtherOne(String str){
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
    
    public static void main(String[] args) {
        Other o = new Other("String new");
        Other.Inner inner = o.new Inner();
        
    }
}
