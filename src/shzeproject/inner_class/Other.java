package shzeproject.inner_class;

import shzeproject.inner_class.inner_class_four.Animal;
import shzeproject.inner_class.inner_class_four.ZooPark;

public class Other {
    private String string;

    public Other(String string){
        this.string = string;
    }

    public class Inner{

        public Inner() {
            System.out.println("I am Inner Class");
        }

        @Override
        public String toString() {
            return string;
        }
    }

    public Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Other otherObject = new Other("I am String");
        System.out.println(otherObject.getInner());


        ZooPark park = new ZooPark();
        Animal animal = park.getMonkey();
       // Animal.Monkey s = ((Animal.Monkey)animal);
    }
}
