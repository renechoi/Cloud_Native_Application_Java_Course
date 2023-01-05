package kosta.selfMission.oop.interfaceComplexAlgorithm;

public class AlgorithmMain {
    public static void main(String[] args) {
        ComplexAlgorithm algorithm = new DummyAlgorithm();
        System.out.println(algorithm.complexAlgorithm(10, 20));

        // 만약 알고리즘 로직을 바꿔서 다시 구현하고자 한다면
        // 새로운 인터페이스 구현체를 만들어서 구현하고
        // new DummyAlgorithm -> new AnotherAlgorithm 으로 바꿔주기만 하면 된다.
    }
}
