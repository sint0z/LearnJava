package shzeproject.string.regular;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntegerMatch {
    public static String knight = "Then, when you have found the shrubbery, you must " +
        "cut down the mighties tree in the forest ...." +
        "with... a herring";



    public static void split(String text, String regex){
        System.out.println(Arrays.toString(text.split(regex)));
    }
    public static void main(String[] args) {
        String text = "Rhis is super |||||| text, |but a am / very good, and yo.";
        String regex = "-?\\d";
        System.out.println("-12314".matches(regex));
        System.out.println("-1".matches(regex));

        String newRegex = "(-|\\+)?\\d+";
        System.out.println("-1254554".matches(newRegex));
        System.out.println("+12".matches(newRegex));
        System.out.println("942".matches(newRegex));

        split(text, " ");
        split(text, "\\W+");
        

        System.out.println(text.replaceFirst("t\\w+", "R"));

        // Задание 7
        boolean isSuggestion = Pattern.matches("^[A-Z].*\\.$", text);
        System.out.println(isSuggestion);
        
        // Задание 8
        split(knight, "the|you");

        // Задание 9
        System.out.println(knight.replaceAll("[aioeuy]", "-"));

        System.out.println("abcabcabc".matches("(abc)+"));

        Pattern pattern = Pattern.compile("^[A-Z].*\\.$");
        Matcher matcher = pattern.matcher(text);
        

        String str = "Java now has regular expression";
        
        List<Pattern> listPattern =
            Arrays.asList(
             Pattern.compile("^Java"),
             Pattern.compile("\\Breg.*"),
             Pattern.compile("n.w\s+h(a|i)s"),
             Pattern.compile("s?"),
             Pattern.compile("s*"),
             Pattern.compile("s+"),
             Pattern.compile("s{4}"),
             Pattern.compile("s{1}"),
             Pattern.compile("s{0,3}")
             );

        System.out.println("----------------");
        for(Pattern p : listPattern){
            Matcher m = p.matcher(str);

            System.out.printf("Регулярное выражение: (%s) -> %b\n",p.pattern(),m.lookingAt());
        }

        String arlineText = "Arline ate eight apples and one orange while Anita hand't any";
        String reg = "(?i)(([^aeiou]) | (\s+[aeiou]))\\w+?[aeiou]\\b";
        Pattern arlineTextRegex = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);
        Matcher m = arlineTextRegex.matcher(arlineText);

        while(m.find()){
            System.out.println(m.group());
        }

    }
}
