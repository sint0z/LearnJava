package shzeproject.exception.threehierarchy;

public class DerivedDerivedException extends DerivedBaseException{
    
    public DerivedDerivedException(){
    }
    
    public DerivedDerivedException(String message){
        super(message);
    }
}
