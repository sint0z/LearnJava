package shzeproject.string.regular;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep {
    public static final String PATH_TO_PROJECT_FOLDER = "C:\\Users\\Lenov\\OneDrive\\Рабочий стол\\Projects\\LearnJava\\LearnJava";
    public static final String DEFAULT_PATH_CATALOG = "\\src\\shzeproject\\string\\regular\\";
    public static final String MAIN_PATH = PATH_TO_PROJECT_FOLDER + DEFAULT_PATH_CATALOG;


    public static List<String> processList(String inputPath) throws Exception{
        File file = processAbsolutePath(inputPath);
        return file.isDirectory() ? processDirectory(file) : processFile(file);
    }

    private static File processAbsolutePath(String path) throws Exception{
        String regex = "^(\\\\?.*?)(\\b\\w+\\.(txt|java))?\\s*$";
        Matcher m = Pattern.compile(regex).matcher(path);
        
        String temp = MAIN_PATH;
        if(m.find()){
            
            if(m.group(1) != null){
                temp = PATH_TO_PROJECT_FOLDER + m.group(1);
            }
            
            if(m.group(2) != null){
                temp+= m.group(2);
            }
        }

        return new File(temp);
    }


    private static List<String> processDirectory(final File directory) throws Exception{
       File[] files = directory.listFiles();
       List<String> tempList = new ArrayList<>();
       if(files != null){
            for(File file : files){
                if(file.isFile()){
                    tempList.addAll(processFile(file));
                }
            }
       }

       return tempList;
    }

    private static List<String> processFile(final File file) throws Exception{
        return Files.readAllLines(file.toPath());
    }


    public static void main(String[] args) throws Exception {
        
        if(args.length < 2){
            System.out.println("No such arguments");
            System.exit(0);
        }

        int flags = 0;
        for(String arg : args){
            if(arg.startsWith("=")){
                flags = switch(arg){
                    case "=ci" -> flags | Pattern.CASE_INSENSITIVE;
                    case "=cm" -> flags | Pattern.COMMENTS;
                    case "=d" -> flags | Pattern.DOTALL;
                    case "=m" -> flags | Pattern.MULTILINE;
                    default -> flags;
                };
            }
        }  
        
        
        Pattern pattern = Pattern.compile(args[1], flags);
        Matcher matcher = pattern.matcher("");
        int index = 0;
        for(String line : processList(args[0])){
            matcher.reset(line);
            while (matcher.find()) {
                System.out.println(index + ": " + matcher.group() + " | " + matcher.start());
                index++;
            }
        }
    }
}
