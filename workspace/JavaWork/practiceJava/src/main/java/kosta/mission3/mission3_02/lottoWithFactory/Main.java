package kosta.mission3.mission3_02.lottoWithFactory;

public class Main {
    public static void main(String[] args) {
        Lotto lotto1 = LottoMachine.createLotto();
        Lotto lotto2 = LottoMachine.createLotto();
        Lotto lotto3 = LottoMachine.createLotto();
        Lotto lotto4 = LottoMachine.createLotto();
        Lotto lotto5 = LottoMachine.createLotto();

        lotto1.show();
    }
}
