package kosta.basic.java.day017.sort;

import java.util.*;
import java.util.stream.IntStream;

public class MemberMain {
    public static void main(String[] args) {
        // TODO : LIST를 생성해서 멤버 여러 개를 추가하고 전체를 출력하자.

        List<Member> members = new ArrayList<>();

        IntStream.range(0, 10).forEach((i) -> members.add(
                new Member(generateName(), i * 3 * 5 * 2 % 7, "seoul")));

        Collections.sort(members, Comparator.comparingInt(Member::getAge));

        Collections.sort(members, new Comparator<Member>() {
            // 이름을 기준으로 오름차순 정렬해보자 !
            // 스트링 클래스의 compareTo
            // 0 -> 서로 같다
            // 음수 -> aa.compareTo(BB)
            // 양수 -> BB.compareTo(AA)

            @Override
            public int compare(Member member1, Member member2) {
                return (member1.getName().compareTo(member2.getName() ) > 0) ? 1 : -1;
            }
        });

        System.out.println(members);


    }

    private static void printingMethods(List<Member> members) {
        // printing 1
        for (int i = 0; i < members.size(); i++) {
            Member member = members.get(i);
            System.out.println(member);
        }

        // printing 2
        for (Member member : members) {
            System.out.println(member);
        }

        // printing 3
        Iterator<Member> iterator = members.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            System.out.println(member);
        }

        // printing 4 - with lambda and stream
        members.stream().forEach(member -> System.out.println(member));

        // printing 5 - with stream and method referencing
        members.forEach(System.out::println);
    }

    private static String generateName() {
        Random random = new Random();
        char[] name = new char[3];
        IntStream.range(0, 3).forEach((i) -> name[i] = (char) random.nextInt(97, 122));
        return Arrays.toString(name).replaceAll("[ ,\\[\\]]", "");
    }


}
