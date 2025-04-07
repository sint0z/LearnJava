package shzeproject.exception.paradox;

import java.io.FileInputStream;

public class MainException {
    public static void main(String[] args) throws Exception{
        FileInputStream inputStream = new FileInputStream("MainException.java");
        inputStream.close();
    }
}
