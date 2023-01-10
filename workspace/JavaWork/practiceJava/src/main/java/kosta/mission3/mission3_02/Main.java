package kosta.mission3.mission3_02;

import kosta.mission3.mission3_02.Lotto.LottoNumberGenerator;
import kosta.mission3.mission3_02.solution1.LottoMachineSolution1;
import kosta.mission3.mission3_02.solution2.LottoMachineSolution2;
import kosta.mission3.mission3_02.solution3.LottoMachineSolution3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO : 로또 번호 1 ~45를 중복되지 않는 정수 6개를 출력해보자
        // 1. 배열로 구현
        // 2. list로 구현
        // 3. set => Treeset으로 구현



        List<Integer> list = new ArrayList<>();


        solution1();
        solution2();
        solution3();

    }

    private static void solution3() {
        LottoMachineSolution3 lottoMachineSolution3 = new LottoMachineSolution3(new LottoNumberGenerator());
        lottoMachineSolution3.generateLotto();
        lottoMachineSolution3.getLottoSolution3s().get(0).show();
    }

    private static void solution2() {
        LottoMachineSolution2 lottoMachineSolution2 = new LottoMachineSolution2(new LottoNumberGenerator());
        lottoMachineSolution2.generateLotto();
        lottoMachineSolution2.getLottoSolution2s().get(0).show();
    }

    private static void solution1() {
        LottoMachineSolution1 lottoMachineSolution1 = LottoMachineSolution1.generate(new LottoNumberGenerator());
        lottoMachineSolution1.getLottos()[0].show();
    }
}
