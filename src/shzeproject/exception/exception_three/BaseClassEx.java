package shzeproject.exception.exception_three;

public class BaseClassEx {

    public BaseClassEx(int size) throws ExceptionInInitializerError{
        if(size < 0){
            throw new ExceptionInInitializerError("Я не готов БОСС!");
        }
    }
}
