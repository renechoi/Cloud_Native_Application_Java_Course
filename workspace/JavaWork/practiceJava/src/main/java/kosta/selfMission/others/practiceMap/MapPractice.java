package kosta.selfMission.others.practiceMap;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        String string = "This is an awesome occasion. This has never happened before.";
    }

    private static void findAllWords(String string) {
        Map<String, Integer> stringOccurances = new HashMap<>();
        String[] words = string.split(" ");

        for (String word : words){
            Integer integer = stringOccurances.get(word);
            if (integer==null){
                stringOccurances.put(word,1);
                continue;
            }
            stringOccurances.put(word, integer+1);
        }
        System.out.println(stringOccurances);
    }

    private static void findAllCharsSolution1(String string) {
        Map<Character, Integer> occurances = new HashMap<>();

        char[] characters = string.toCharArray();
        for (char character : characters){
            Integer integer = occurances.get(character);
            if (integer==null){
                occurances.put(character, 1);
                continue;
            }
            occurances.put(character,integer+1);
        }

        System.out.println(occurances);
    }
}
