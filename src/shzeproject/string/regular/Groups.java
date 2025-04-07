package shzeproject.string.regular;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    public static final String POEM =
        "Twas brillig, and the slithy toves\n" +
        "Did gyre and gimble in the wabe.\n" +
        "All mimsy were the borogoves,\n" +
        "And the mome raths outgrabe.\n\n" +
        "Beware the Jabberwock, my son,\n" +
        "The jaws that bite, the claws that catch.\n" +
        "Beware the lubjub bird, and shun\n" +
        "The frumious Bandersnatch.";

    public static void main(String[] args) {
        // A pattern to match lines starting with "Beware"
       
        Pattern pattern = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S++))");
        Matcher m = pattern.matcher(POEM);
        
        Map<String, Integer> map = new LinkedHashMap<>();
        
        while (m.find()) {
            for(int i = 0; i < m.groupCount(); i++){
                if(m.group(i).matches("\\b[a-z]\\w+(\\.|,)?")){
                    String str = m.group(i).replaceAll("\\W+", "").toLowerCase();
                    map.put(str, map.getOrDefault(str, 0) + 1);
                }
            }
        }
  
        if(map.isEmpty()){
            System.out.println("Map is Empty");
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.printf("Word -> %s | %d\n", entry.getKey(), entry.getValue());
        }
    }
}
