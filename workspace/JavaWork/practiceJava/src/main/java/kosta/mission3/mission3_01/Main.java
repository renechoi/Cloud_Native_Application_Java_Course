package kosta.mission3.mission3_01;

import kosta.mission3.mission3_01.validation.NumberFormatValidator;
import kosta.mission3.mission3_01.validation.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        // List 자료구조를 활용하여 키보드로부터 입력받은 문자열을 처리하자
        // 1. 데이터추가 2. 데이터 삭제 3. 전체출력

        String inputString = getInput();
        Validator numericValidator = new Validator(new NumberFormatValidator());
        numericValidator.validate(inputString);

        List<String> stringList = new ArrayList<>();

        switch (inputString){
            case "1" -> addFunction();
            case "2" -> removeFunction();
            case "3" -> printFunction();
        }

    }

    private static void printFunction() {
        System.out.println("전체 출력");
    }

    private static void removeFunction() {
        System.out.println("데이터 삭제");
    }

    private static void addFunction() {
        System.out.println("데이터 추가");
    }

    private static String getInput(){
        String inputString = getInput();
        Validator.validate2(new NumberFormatValidator(), inputString);
        return inputString;
    }
}
