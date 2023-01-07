package kosta.toyMission.baseball.domain.computer;

public class Computer {
    private Baseball baseball;

    public Computer() {
    }

    private Computer(Baseball baseball) {
        this.baseball = baseball;
    }

    public static Computer createBaseball(){
        ComputerBaseballGenerator computerBaseballGenerator = new ComputerBaseballGenerator(new ComputerNumberGenerator());
        Baseball baseball = computerBaseballGenerator.makeBaseball();
        return new Computer(baseball);
    }

    public Baseball getBaseball() {
        return baseball;
    }
}
