package kosta.basic.day015.api.string;

public class StringMain {
    public static void main(String[] args) {

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
