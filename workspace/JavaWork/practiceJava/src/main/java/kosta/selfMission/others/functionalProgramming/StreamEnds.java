package kosta.selfMission.others.functionalProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamEnds {
    public static void main(String[] args) {

        // stream ends
        // reduce, get, forEach, collect to list

        int max = List.of(23,13,14,35,53).stream().max((n1, n2) -> Integer.compare(n1,n2)).get();
        System.out.println(max);

        List.of(23, 12, 34, 50, 53).stream().filter(e->e%2==1).collect(Collectors.toList());

        IntStream.range(1, 10).map(e->e*e) // integer pipeline
                .boxed()  // intStream -> stream
                .collect(Collectors.toList());


    }
}
