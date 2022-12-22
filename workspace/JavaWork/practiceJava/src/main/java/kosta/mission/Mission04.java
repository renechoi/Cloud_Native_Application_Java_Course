package kosta.mission;

import java.util.Scanner;

public class Mission04 {
    //TODO : 로그인 예제를 구현해 보자
    // id, password를 입력 받는다
    // id와 password가 모두 일치하면 로그인 성공
    // id가 불일치 -> 해당 id가 존재하지 않습니다 메시지 출력
    // password가 불일치하면 -> 비밀번호가 일치하지 않습니다 메시지 출력

    public static void main(String[] args) {

        practiceLoginVerification();

    }

    private static void practiceLoginVerification() {
        String id = "kosta";
        String password = "1234";

        Scanner scanner = new Scanner(System.in);

        String idInput = scanner.nextLine().trim();
        String pwInput = scanner.nextLine().trim();

        if (id.equals(idInput) && password.equals(pwInput)) {
            System.out.println("로그인 성공");
            return;
        }
        if (!password.equals(pwInput)) {
            System.out.println("비밀번호가 일치하지 않습니다.");
        }
        if (!id.equals(idInput)) {
            System.out.println("id가 일치하지 않습니다.");
        }
    }

}
