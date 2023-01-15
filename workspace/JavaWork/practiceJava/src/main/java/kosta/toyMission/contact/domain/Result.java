package kosta.toyMission.contact.domain;

public class Result {
    private boolean success;
    private boolean quit;

    public Result(boolean success, boolean quit) {
        this.success = success;
        this.quit = quit;
    }

    public boolean isSuccess() {
        return success;
    }

    public boolean isQuit() {
        return quit;
    }
}
