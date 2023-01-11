package kosta.basic.day017.sort;

import java.util.Comparator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


class descendingComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1, o2);
    }
}

public class Main {
    public static void main(String[] args) {
        // Arrays.sort(배열) -> 오름차순
        // List -> 입력순서 -> 정렬순서
        // Collections.sort( 리 스 트 )

        // Comparable -> compareTo 로 정렬 기준을 세우기         // 객체에서는 comparable을 구현하여 override
        // Comparator -> compare()                          // comparator를 만들 경우는 comparator를


        Random random = new Random();
        Set<Integer> treeSet = new TreeSet<>(new descendingComparator());
        Set<Integer> treeSet2 = new TreeSet<>(Integer::compare);

        for (int i = 0; i < 10; i++) {
            treeSet.add(random.nextInt(45) + 1);
            treeSet2.add(random.nextInt(45) + 1);
        }

        System.out.println(treeSet);
        System.out.println(treeSet2);
    }
}
