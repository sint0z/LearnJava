package shzeproject.exception.faillingconstructor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {
    private static long counter = 1;
    private final long id = counter++;
    private BufferedReader bf;


    public InputFile(String fname) throws FileNotFoundException, IOException{
        try {
            bf = new BufferedReader(new FileReader(fname));
        } catch (FileNotFoundException e) {
            System.out.println("File is not found: " + e.getMessage());
            throw e;
        } catch(Exception e){
            try{
                bf.close();
            }catch(IOException ioe){
                System.out.println("Error in work " + ioe.getMessage());
            }
            throw e;
        }
    }

    public String getLine() throws IOException{
        String str;
        try{
           str = bf.readLine();
        }catch(IOException e){
            throw new RuntimeException("Errors in getLine()", e);
        }
        return str;
    }

    public void dispose() throws IOException{
        try {
            bf.close();
            System.out.println("Object #" + id + " is dispose successful");
        } catch (IOException e) {
            throw new RuntimeException("Errors in dispose()", e);
        }
    }
}
