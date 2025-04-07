package shzeproject.string.regular;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
  This is new comments
  THIS 2 line comments
 */

public class Comments {
    public static String read(String fileName) throws IOException{
        Path path = Path.of(fileName);
        return Files.exists(path) ? Files.readString(path): null;
    }

    public static List<String> getComments(String text){
        String cleanText = text.replaceAll("Pattern\\.compile\\([^)]*\\)", "");
        Pattern pattern = Pattern.compile("(?://.*?$)|(/\\*.*?\\*/)", Pattern.DOTALL | Pattern.MULTILINE);
        List<String> comments = new ArrayList<>(); 
        Matcher matcher = pattern.matcher(cleanText);

        while (matcher.find()) { 
                String comment = matcher.group().trim();
                if (comment.startsWith("/*")) {
                    comment = comment.substring(2, comment.length() - 2)
                                  .replaceAll("(?m)^\\s*\\*?", "");
                } else {
                    comment = comment.substring(2);
                }
                comments.add(comment.trim());
            }
        return comments;
    }
 
    public static List<String> getStringLiteral(String text){
        List<String> stringLiterals = new ArrayList<>();
        Pattern pattern = Pattern.compile("\"(?:\\\\.|[^\"\\n])*\"|'''(?:\\n|.)*?'''|\"\"\"(?:\\n|.)*?\"\"\"", Pattern.DOTALL | Pattern.MULTILINE);
        Matcher m = pattern.matcher(text);

        while(m.find()){
            stringLiterals.add(m.group());
        }
        return stringLiterals;
    } 

    // Read comment
    public static void main(String[] args) throws IOException {
        if(args.length < 1){
            System.out.println("No such arguments");
            System.exit(0);
        }

        
        
        String text = read(args[0]);  ;
        Pattern pattern = Pattern.compile("\"(?:\\\\.|[^\"\\n])*\"|'''(?:\\n|.)*?'''|\"\"\"(?:\\n|.)*?\"\"\"", Pattern.DOTALL | Pattern.MULTILINE);
        Matcher m = pattern.matcher(text);

        while(m.find()){
            System.out.println("-> " + m.group());
        }
        
        // for (int i = 0; i < comments.size(); i++) {
        //     System.out.printf("Comment #%d:%n%s%n%n", i + 1, comments.get(i)); 
        // }
        
    }
}
