package kosta.basic.day015.api.string;

import java.util.Arrays;

public class StringMain {

    public static String QUERY = "select * from board";

    public static void main(String[] args) {



    }

    private static boolean isPalindrome1(String str) {
        // using StringBuilder
        if (str == null)
            return false;
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString().equals(str);
    }

    private static boolean isPalindrome2(String str){
        if (str == null)
            return false;

        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }




    private static void practiceStringToArray() {
        byte[] bytesArray = QUERY.getBytes();
        char[] charsArray = QUERY.toCharArray();

        System.out.println(Arrays.toString(bytesArray));
        System.out.println(Arrays.toString(charsArray));
    }

    private static void convertToString() {
        int n = 10;
        String s = n + "";
        String s2 = String.valueOf(n);
    }

    private static void stringToArray() {
        String fruits = "사과/포도/수박/배";
        String[] fruitSets = fruits.split("/");
        System.out.println(Arrays.toString(fruitSets));
    }

    private static void practiceEqualsIgnoreCase() {
        String id = "kosta";
        String id2 = "KOSTA";

        if (id.equalsIgnoreCase(id2)) {
            System.out.println("같다");
        }
    }

    private static void practiceEndsWtih() {
        if (QUERY.endsWith("jpg")) {
            System.out.println("this is img!");
        }
    }

    private static void practiceSubstring() {
        String query = "select * from board";

        // 퀴즈 query 에서 board 문자열만 추출해서 출력해보자

        System.out.println(query.substring(14, 19));

        String fileName = "kosta.jpg";
        String head = fileName.replace(".jpg", "");
        String head2 = fileName.substring(0, fileName.indexOf("."));
        String tail = fileName.substring(fileName.indexOf(".") + 1);

        System.out.printf("%s : %s", head2, tail);


    }

    private static void stringMethodExamples() {
        // 해당 문자열의 위치를 찾기 !
        // indexOf : 있으면 해당 문자열, 없으면 -1
        String query = "select * from board";

        System.out.println(query.indexOf("*"));
        System.out.println(query.indexOf("board"));
        System.out.println(query.indexOf("$"));

        System.out.println(query.length());

        System.out.println(query.charAt(0));    // 범위 초과시 StringIndexOutOfBoundsException

        System.out.println(query.substring(9, 19));
        System.out.println(query.substring(9));
    }

    private static void stringConcatenationExample() {
        String string = "ABC";

        string.concat("DEF");

        System.out.println(string);                      // ABC
        System.out.println(string.concat("DEF"));    // ABCDEF

        // 동적쿼리문
        String query = "select * from board";
        int num = 10;
        String query2 = "select * from board";
        // "+" 연산자를 이용한 변경
        if (num == 10) {
            query += "where num = 10";
            query2 = query2.concat("where num = 10");
        }
        System.out.println(query);
        System.out.println(query2);

        StringBuffer stringBuffer = new StringBuffer("select * from board");
        stringBuffer.append("where num = 10");

        System.out.println(stringBuffer);
    }

    private static void stringIdentification() {
        String string = "ABC";
        String string2 = "ABC";
        String string3 = new String("ABC");


        Runnable identification = string.equals(string2) ?
                () -> System.out.println("equals true!") :
                () -> System.out.println("equals false!");

        identification.run();

        Runnable identification2 = string2.equals(string3) ?
                () -> System.out.println("equals true!") :
                () -> System.out.println("equals false!");

        identification2.run();

        Runnable identification3 = string == string3 ?
                () -> System.out.println("equals true!") :
                () -> System.out.println("equals false!");

        identification3.run();
    }
}
