package kosta.selfMission.others.stream2;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.partitioningBy;

public class PrimeMain {
    public static void main(String[] args) {

    }

    public boolean isPrime(int candidate) {
        // 2부터 candidate 미만 자연수를 생성한다
        // 스트림의 모든 정수를 candidate로 나눌 수 없으면 true를 반환한다.
        return IntStream.range(2, candidate).noneMatch(i -> candidate % i == 0);
    }

    public boolean isPrime2(int candidate){
        // 제곱근 이하로 수를 제한하기
        int candidateRoot = (int) Math.sqrt(  (double) candidate);
        return IntStream.rangeClosed(2, candidateRoot).noneMatch(i -> candidate % i ==0);
    }

    public Map<Boolean, List<Integer>> partitionPrimes(int n){
        // 파티셔닝을 이용해 소수와 비소수를 구분한다.
        return IntStream.rangeClosed(2, n).boxed().collect(partitioningBy(candidate -> isPrime(candidate)));
    }
}
