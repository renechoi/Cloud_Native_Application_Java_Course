package kosta.mission3.mission3_02.solution3;

import kosta.mission3.mission3_02.Lotto.LottoNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class LottoMachineSolution3 {

    private List<LottoSolution3> lottoSolution3s = new ArrayList<>();
    private final LottoNumberGenerator lottoNumberGenerator;

    public LottoMachineSolution3(LottoNumberGenerator lottoNumberGenerator) {
        this.lottoNumberGenerator = lottoNumberGenerator;
    }

    public void generateLotto(){
        lottoSolution3s.add(LottoSolution3.of(lottoNumberGenerator));
    }

    public List<LottoSolution3> getLottoSolution3s() {
        return lottoSolution3s;
    }
}
