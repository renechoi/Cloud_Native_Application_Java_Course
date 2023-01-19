package kosta.basic.java.day015.api.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringQuiz1 {
    public static void main(String[] args) throws IOException {

        // TODO : 한 개의 문자열을 입력 받고,
        // 특정 문자를 입력 받아 해당 특정문자가 입력 받은 문자열에 몇 개 존재하는지 알아내보자

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String string1 = convertToSafeString(bufferedReader.readLine());
        String string2 = convertToSafeString(bufferedReader.readLine());

        // solution 1
        System.out.println(findCounts(string1, string2));

        // solution 2
        System.out.println(findCounts2(string1, string2));

        // solution 3
        System.out.println(findCounts3(string1, string2));

        // solution 4 => recursion
        System.out.println(findCounts4(string1, string2, 0));

    }

    private static int findCounts(String string1, String string2) {
        if (!string1.contains(string2)) {
            return 0;
        }

        return string1.length() - string1.replaceAll(string2, "").length();
    }

    private static int findCounts2(String string1, String string2) {
        return (int) string1.chars().filter(v -> v == string2.charAt(0)).count();
    }

    private static int findCounts3(String string1, String string2) {
        char[] alphabets = string1.toCharArray();

        int sum =0;
        for (Character alphabet : alphabets){
            sum = alphabet.equals(string2.charAt(0)) ? sum + 1 : sum;
        }
        return sum;
    }

    private static int findCounts4(String string1, String string2, int index) {
        if (index >= string1.length()) {
            return 0;
        }

        int count = string1.charAt(index) == string2.charAt(0) ? 1 : 0;
        return count + findCounts4(string1, string2, index + 1);
    }

    private static String convertToSafeString(String string) {
        return string.toLowerCase().trim();
    }
}
