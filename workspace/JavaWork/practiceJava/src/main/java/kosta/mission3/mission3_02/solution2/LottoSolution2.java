package kosta.mission3.mission3_02.solution2;

import kosta.mission3.mission3_02.Lotto.LottoNumberGenerator;

import java.util.*;
import java.util.stream.Stream;

public class LottoSolution2 {

    private static List<Integer> lotto = new ArrayList<>();

    public LottoSolution2(List<Integer> lotto) {
        this.lotto = lotto;
    }

    public static LottoSolution2 of(LottoNumberGenerator lottoNumberGenerator) {
//        // struture way
        Set<Integer> lottoNumbers = new TreeSet<>();
        while (lottoNumbers.size() != 6) {
            int numberGenerated = lottoNumberGenerator.generateRandomNumber();
            lottoNumbers.add(numberGenerated);
        }
//        return new ArrayList<>(lottoNumbers);

        // functional way
        Stream.generate(lottoNumberGenerator::generateRandomNumber)
                .limit(6)
                .filter(v-> !lotto.contains(v))
                .forEach((v)->lotto.add(v));
        return new LottoSolution2(lotto);
    }

    public void show() {
        System.out.println(Arrays.toString(lotto.toArray()));
    }
}
