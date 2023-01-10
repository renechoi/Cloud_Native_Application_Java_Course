package kosta.mission3.lottoWithFactory;

import kosta.mission3.mission3_02.Lotto.LottoNumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LottoMachine {
    private static final LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();

    public static Lotto createLotto(){
        List<Integer> lottoNumbers = new ArrayList<>();

        Stream.generate(lottoNumberGenerator::generateRandomNumber)
                .filter(v-> !lottoNumbers.contains(v))
                .limit(6)
                .forEach(lottoNumbers::add);

        return new Lotto(lottoNumbers);
    }
}
