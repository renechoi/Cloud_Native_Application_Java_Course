package kosta.mission2.Mission2_10.bank;

public class Command {
    private String command;

    public Command(String userInput) {
        validate(userInput);
        this.command = userInput;
    }

    public static Command valueOf(String userInput){
        validate(userInput);
        return new Command(userInput);
    }

    public String getCommand() {
        return command;
    }

    private static void validate(String userInput){
        if (!isNumber(userInput) || !isAssignedNumber(userInput)){
            throw new InvalidCommandException();
        }
    }

    private static boolean isNumber(String userInput){
        return userInput.matches("[0-9qQ]");
    }

    private static boolean isAssignedNumber(String userInput){
        return userInput.matches("[1-5qQ]");
    }

}
