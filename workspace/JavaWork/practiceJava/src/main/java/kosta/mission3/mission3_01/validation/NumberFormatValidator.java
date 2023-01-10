package kosta.mission3.mission3_01.validation;

public class NumberFormatValidator implements ValidateFunction {
    @Override
    public void validate(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException();
        }
    }
}
