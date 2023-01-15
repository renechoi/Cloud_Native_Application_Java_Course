package kosta.selfMission.others.concurrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner2 {
    public static void main(String[] args) {
        ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();
        String words = "ABCD ABCD ABCD";

        for (char character: words.toCharArray()){
            occurances.computeIfAbsent(character, ch-> new LongAdder()).increment();
        }
        System.out.println(occurances);
    }
}
