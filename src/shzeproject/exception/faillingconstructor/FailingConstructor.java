package shzeproject.exception.faillingconstructor;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FailingConstructor {
    private InputFile inputFile;

    public FailingConstructor(String fileName) throws IOException {
        try {
            inputFile = new InputFile(fileName);
        } catch (FileNotFoundException fne) {
            try {
                inputFile = new InputFile(fileName);  
            } catch (FileNotFoundException fne2) {
                try {
                    inputFile.dispose();
                    System.out.println();
                } catch (IOException ioe) {
                    System.out.println("Error in work " + ioe.getMessage());
                }
                throw fne2;
            } 
            
            throw fne;
        }
    }   

    public void dispose(){
        try{
            inputFile.dispose();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        try {
            FailingConstructor fc = new FailingConstructor("C:\\Users\\Lenov\\OneDrive\\Рабочий стол\\PythonVSCode\\second\\unical_words.py");
            try {
                
            } finally {
                fc.dispose();
            }
        } catch (Exception e) {
            System.out.println("Появилось исключение: " + e.getMessage());
        } 
    }


}
