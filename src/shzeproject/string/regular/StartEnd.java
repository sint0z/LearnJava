package shzeproject.string.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {
    private static class Display{
        private boolean isRegexPrinted = false;
        private String regex;

        Display(String regex){
            this.regex = regex;
        }

        void display(String line){
            if(!isRegexPrinted){
                System.out.println(" | " + regex);
                isRegexPrinted = true;
            }
            System.out.println(line);
        }
    }


    public static void examine(String str, String regex){
        Display d = new Display(regex);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            d.display("find() " + matcher.group() + " (" + matcher.start() + " - " + matcher.end() + ")");
            if(matcher.lookingAt()){
                d.display("lookingAt() (" + matcher.start() + " - " + matcher.end() + ")");
            }
            if(matcher.matches()){
                d.display("matches() (" + matcher.start() + " - " + matcher.end() + ")");
            }
        }

    }

    public static void main(String[] args) {
        String[] strings = Groups.POEM.split("\n");

        for(String str : strings){
            System.out.printf("input: %s", str);

            for(String regex : new String[]{"\\bt\\w+", "^[A-Z].+[A-Z]\\w+,.*,$"}){
                examine(str, regex);
            }
        }

        System.out.println("SupperTest");
        
    }
}
