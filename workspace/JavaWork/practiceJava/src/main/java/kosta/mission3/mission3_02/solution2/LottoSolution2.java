package kosta.mission3.mission3_02.solution2;

import kosta.mission3.mission3_02.Lotto.LottoNumberGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LottoSolution2 {

    private List<Integer> lotto;

    public LottoSolution2(List<Integer> lotto) {
        this.lotto = lotto;
    }

    public static LottoSolution2 of(LottoNumberGenerator lottoNumberGenerator){
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size()!=6){
            int numberGenerated = lottoNumberGenerator.generateRandomNumber();
            if (isDuplicateExist(numberGenerated, numbers)){
                continue;
            }
            numbers.add(numberGenerated);
        }
        return new LottoSolution2(numbers);
    }

    private static boolean isDuplicateExist(int numberGenerated, List<Integer> numbers){
        return numbers.contains(numberGenerated);
    }

    public void show() {
        System.out.println(Arrays.toString(lotto.toArray()));
    }
}
