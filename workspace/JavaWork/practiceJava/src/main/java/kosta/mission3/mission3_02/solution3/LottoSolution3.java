package kosta.mission3.mission3_02.solution3;

import kosta.mission3.mission3_02.Lotto.LottoNumberGenerator;

import java.util.TreeSet;

public class LottoSolution3 {

    private TreeSet<Integer> lotto;

    public LottoSolution3(TreeSet<Integer> lotto) {
        this.lotto = lotto;
    }

    public static LottoSolution3 of(LottoNumberGenerator lottoNumberGenerator) {
        TreeSet<Integer> numbers = new TreeSet<>();
        while (numbers.size() != 6) {
            int numberGenerated = lottoNumberGenerator.generateRandomNumber();
            numbers.add(numberGenerated);
        }
        return new LottoSolution3(numbers);
    }

    public void show() {
        System.out.println(lotto);
    }
}
