package shzeproject.exception.exception_one;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class TellingException extends Exception{
    private final Logger logger = Logger.getLogger("TellingException");

    private void sendMessage(){
        StringWriter sWriter = new StringWriter();
        printStackTrace(new PrintWriter(sWriter));
        logger.severe(sWriter.toString());
    }
    
    public TellingException(){
        sendMessage();
    }
    public TellingException(String message){
        super(message);
        sendMessage();
    }

    @Override
    public String getMessage() {
        return "Ты че попутал? -> на исключение: " + super.getMessage();
    }



    
}
