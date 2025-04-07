package shzeproject.exception.threehierarchy;

public class ClassB extends ClassA{

    @Override
    public void getException() throws DerivedBaseException {
        throw new DerivedBaseException("Two");
    }
    
}
