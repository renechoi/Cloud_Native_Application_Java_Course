package kosta.mission2.mission2_07.domain;

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
