package kosta.mission.mission06;

public class Mission06 {
    public static void main(String[] args) {
        // TODO : UpDown 게임을 구현해보자.
        // 임의의 난수를 생성 : 1~100 사이
        // 키보드로부터 정수를 입력(1~100) => Validation check
        // 입력한 숫자와 정답을 비교해서
        // 정답을 맞추면 : good ! 몇 번 만에 성공
        // 오답 : 입력 값보다 크다면 up, 작으면 down

        RandomNumber randomNumber = new RandomNumber(100);
        int generatedRandomNumber = randomNumber.getRandomNumber();

        int count = 0;

        while (true) {
            InputNumber inputNumber = new InputNumber();
            int userNumber = inputNumber.getInputNumber();
            count++;
            if (isMatch(userNumber, generatedRandomNumber, count)) {
                break;
            }
        }
    }

    private static boolean isMatch(int userNumber, int randomNumber, int count) {
        if (userNumber == randomNumber) {
            System.out.printf("축하합니다! %d번 만에 성공!", count);
            return true;
        }

        System.out.println("틀렸습니다");
        printHint(userNumber, randomNumber);
        return false;
    }

    private static void printHint(int userNumber, int randomNumber) {
        if (userNumber > randomNumber) {
            System.out.println("go down!");
            return;
        }
        System.out.println("go up!");
    }
}
