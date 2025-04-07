package shzeproject.exception.threehierarchy;

public class ClassC extends ClassB {

    @Override
    public void getException() throws DerivedDerivedException {
        throw new DerivedDerivedException("Three");
    }
    
    public static void main(String[] args) {
        ClassA cClass = new ClassC();
        try {
            cClass.getException();
        } catch(DerivedBaseException e){
            System.out.println("Plus "+ e.getLocalizedMessage());

        } catch (BaseException e) {
            System.out.println(e.getMessage());
        }
    }
}
