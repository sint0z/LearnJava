package shzeproject.interface_and_abstraction.abstract_one;

public abstract class AbstractZeroAbstractMethod {
    private int a = 0;
    String noAbstractMethodOne(){
        return "This is Abstract Class Baby!";
    } 

    int noAbstractMethodTwo(){
        return ++a;
    } 
    
    public static void main(String[] args) {
    /* 
     * Даже если методы не являються абстрактными, то абстрактный класс вызвать нельзя
     * AbstractZeroAbstractMethod abstractClass = new AbstractZeroAbstractMethod();
     * abstractClass.noAbstractMethodOne(); 
    */
    }

}
