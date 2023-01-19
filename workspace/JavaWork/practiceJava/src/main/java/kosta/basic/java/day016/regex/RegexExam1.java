package kosta.basic.java.day016.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class RegexExam1 {
    public static void main(String[] args) {

        String source = "HP: 010-1111-1111, HOME: 02-222-2222";
        String regex = "(\\d){2,3}-(\\d){3,4}-(\\d){4}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);

        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }

    private static void regexExam2() {
        String source = "ab?cd?de?gh";
        String regex = "(\\w*)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }

    private static void regexExam1() {
        String data[] = {
                "bat", "bba", "bbg", "bonus",
                "CA", "ca", "c232", "car",
                "date", "dic", "diraaa"
        };

        Pattern pattern = Pattern.compile("c[a-z]*");

        for (int i = 0; i < data.length; i++) {
            Matcher matcher = pattern.matcher(data[i]);

            if (matcher.matches()) {
                System.out.println(data[i]);
            }
        }

        System.out.println(IntStream.range(0, data.length)
                .mapToObj(v -> pattern.matcher(data[v]).matches())
                .filter(v -> v == true)
                .count());
    }
}
