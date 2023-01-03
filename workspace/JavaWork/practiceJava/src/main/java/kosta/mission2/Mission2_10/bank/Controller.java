package kosta.mission2.Mission2_10.bank;

import kosta.mission2.Mission2_10.bank.bank.Bank;
import kosta.mission2.Mission2_10.bank.ui.InputView;

public class Controller {
    private Bank bank;
    private Command command;

    public Controller() {
    }

    public void run() {
        bank = new Bank();
        do {
            getCommand();
            doBankStuff(command);
        } while (!"Qq".contains(command.getCommand()));
    }

    private void doBankStuff(Command command){
        try{
        switch (command.getCommand()) {
            case "1" -> this.bank.addCustomer();
            case "2" -> this.bank.printCustomerInfo();
            case "3" -> this.bank.printAllCustomerInfo();
            case "4" -> this.bank.deposit();
            case "5" -> this.bank.withdraw();
        }
        } catch (Exception ignored){
        }
    }

    private void getCommand() {
        try {
            command = Command.valueOf(InputView.getInputCommand());
        } catch (IllegalArgumentException e) {
            getCommand();
        }
    }

}
