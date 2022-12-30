package kosta.mission2.mission2_07.ui;

public class InvalidNumberInputException extends IllegalArgumentException{
    public static final String INVALID_COMMAND= "입력값이 잘못되었습니다. 숫자만 입력하세요";

    public InvalidNumberInputException(String s){
        super(s);
    }
}
