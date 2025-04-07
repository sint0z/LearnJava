package shzeproject.collection.set;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class UniqueWord {
    private final Set<Character> vowelSet = new HashSet<>();
    private final Map<Character, Integer> vowelMap = new LinkedHashMap<>();

    public UniqueWord(){
        String lowerVowel = "аеёиоуыэюя";
        String upperVowel = lowerVowel.toUpperCase();

        for(char c : (lowerVowel + upperVowel).toCharArray()){
            vowelSet.add(c);
        }

        for(char c : (lowerVowel + upperVowel).toCharArray()){
            vowelMap.put(c, 0);
        }
    }

    public int countVowel(final String word){
        int counter = 0;
        for(char c : word.toCharArray()){
            if(vowelSet.contains(c)){
                counter++;
            }
        }

        return counter;
    }

    public Map<Character, Integer> countVowelMap(final String word){

        for(char c : word.toCharArray()){
            if(vowelMap.containsKey(c)){
                vowelMap.replace(c, vowelMap.get(c) + 1);
            }
        }
        return vowelMap;
    }

    public static void main(String[] args) {
        UniqueWord un = new UniqueWord();
        System.out.println(un.countVowel("Негра"));
        
        un.countVowelMap("Никита").forEach((k,v) -> System.out.println("Char: " + k + " | " + v));
    }
}
