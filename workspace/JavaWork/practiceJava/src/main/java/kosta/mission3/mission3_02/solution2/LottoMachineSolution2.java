package kosta.mission3.mission3_02.solution2;

import kosta.mission3.mission3_02.Lotto.LottoNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class LottoMachineSolution2 {

    private List<LottoSolution2> lottoSolution2s = new ArrayList<>();
    private final LottoNumberGenerator lottoNumberGenerator;

    public LottoMachineSolution2(LottoNumberGenerator lottoNumberGenerator) {
        this.lottoNumberGenerator = lottoNumberGenerator;
    }

    public void generateLotto(){
       lottoSolution2s.add(LottoSolution2.of(lottoNumberGenerator));
    }

    public List<LottoSolution2> getLottoSolution2s() {
        return lottoSolution2s;
    }
}
