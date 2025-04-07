package shzeproject.exception.threehierarchy;

public class ClassA {

    public void getException() throws BaseException{
        throw new BaseException("Base");
    }
}
