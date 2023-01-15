package kosta.selfMission.others.concurrent;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
    public static void main(String[] args) {
      Map<Character, LongAdder> occurances = new Hashtable<>();
        String words = "ABCD ABCD ABCD";

        System.out.println(occurances);

        for (char character: words.toCharArray()){
            LongAdder longAdder = occurances.get(character);
            if (longAdder == null) {
                longAdder = new LongAdder();
            }
            longAdder.increment();
            occurances.put(character, longAdder);
        }
        System.out.println(occurances);
    }
}
