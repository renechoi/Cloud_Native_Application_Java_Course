package kosta.mission3.mission3_02;

import kosta.mission3.mission3_02.lottoWithFactory.Lotto;
import kosta.mission3.mission3_02.Lotto.LottoNumberGenerator;
import kosta.mission3.mission3_02.solution2.LottoSolution2;

import java.util.function.Supplier;

public class SupplierPractice {
    public static void main(String[] args) {
        Supplier<Lotto> lottoSupplier = (Supplier<Lotto>) LottoSolution2.of(new LottoNumberGenerator());



    }
}
