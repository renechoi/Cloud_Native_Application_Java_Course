package kosta.mission2.mission2_06.solution1;

enum Command {
    CREATE(1, new Bank().createAccount()),
    VIEW_ALL(2, new Bank().createAccount()),
    VIEW_ACCOUNT(3, new Bank().createAccount()),
    DEPOSIT(4, new Bank().createAccount()),
    WITHDRAW(5, new Bank().createAccount());

    private final int command;
    private final Account account;


    Command(int command, Account account) {
        this.command = command;
        this.account = account;
    }

    public int getCommand() {
        return command;
    }

    public Account getAccount() {
        return account;
    }

}
