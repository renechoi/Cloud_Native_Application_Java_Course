package kosta.mission3.mission3_01.validation;

public class Validator {
    private final ValidateFunction validateFunction;

    public Validator(ValidateFunction validateFunction) {
        this.validateFunction = validateFunction;
    }

    public void validate(String input){
        validateFunction.validate(input);
    }

    public static Validator validate2(ValidateFunction validateFunction, String input){
        validateFunction.validate(input);
        return new Validator(validateFunction);
    }
}
