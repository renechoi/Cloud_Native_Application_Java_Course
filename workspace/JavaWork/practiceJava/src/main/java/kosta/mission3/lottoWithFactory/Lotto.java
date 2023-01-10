package kosta.mission3.lottoWithFactory;

import java.util.Arrays;
import java.util.List;

public class Lotto {
    private List<Integer> lottoNumbers;

    public Lotto(List<Integer> lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public void show() {
        System.out.println(Arrays.toString(lottoNumbers.toArray()));
    }
}
