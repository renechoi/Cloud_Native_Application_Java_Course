package kosta.mission3.mission3_02.lectureSolution;

import java.util.*;

public class LottoMain {
    public static void main(String[] args) {

    }

    private static void lottoWithSet() {
        Random random = new Random();
        Set<Integer> set = new TreeSet<>();

        for (int i =0; set.size() < 6; i ++){
            set.add(random.nextInt(45) + 1);
        }

        System.out.println(set);
    }

    private static void lottoWithList() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        while (true) {
            int number = random.nextInt(45) + 1;
            if (list.contains(number)) {
                continue;
            } else {
                list.add(number);
            }

            if (list.size() == 6) {
                break;
            }

            Collections.sort(list);
            System.out.println(list);
        }
    }

    private static void lottoWithArray() {
        Random random = new Random();
        int[] randomNumbers = new int[6];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(45);
            for (int j = 0; j < i; j++) {
                if (randomNumbers[i] == randomNumbers[j]) {
                    i--;
                }
            }
        }
    }
}