package kosta.mission3.mission3_02.solution1;

import kosta.mission3.mission3_02.Lotto.LottoNumberGenerator;

public class LottoMachineSolution1 {
    public static final int LOTTO_DIGITS = 6;
    private final LottoNumberGenerator lottoNumberGenerator;
    private final LottoSolution1 lottoSolution1;
    private LottoSolution1[] lottoSolution1s = new LottoSolution1[10];

    public LottoMachineSolution1(LottoNumberGenerator lottoNumberGenerator, LottoSolution1 lottoSolution1) {
        this.lottoNumberGenerator = lottoNumberGenerator;
        this.lottoSolution1 = lottoSolution1;
        saveLotto(lottoSolution1);
    }

    public static LottoMachineSolution1 generate(LottoNumberGenerator lottoNumberGenerator) {
        int[] lottoNumbers = new int[LOTTO_DIGITS];
        int count = 0;
        while (lottoNumbers[5] == 0) {
            lottoNumbers[count] = fetchLottoNumbers(lottoNumberGenerator, lottoNumbers);
            count++;
        }
        return new LottoMachineSolution1(lottoNumberGenerator, new LottoSolution1(lottoNumbers));
    }

    private static int fetchLottoNumbers(LottoNumberGenerator lottoNumberGenerator, int[] lottoNumbers){
        int number = lottoNumberGenerator.generateRandomNumber();
        return validate(lottoNumberGenerator, number, lottoNumbers);
    }

    private static int validate(LottoNumberGenerator lottoNumberGenerator, int numberGenerated, int[] lottoNumbers){
        for (int lottoNumber : lottoNumbers) {
            if (lottoNumber == numberGenerated) {
                return fetchLottoNumbers(lottoNumberGenerator, lottoNumbers);
            }
        }
        return numberGenerated;
    }

    private void saveLotto(LottoSolution1 lottoSolution1) {
        for (int i = 0; i < lottoSolution1s.length; i++) {
            if ( lottoSolution1s[i] == null) {
                lottoSolution1s[i] = lottoSolution1;
                return;
            }
        }
    }

    public LottoSolution1[] getLottos() {
        return lottoSolution1s;
    }
}
