package kosta.mission2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;


public class Mission2_04 {

    @ParameterizedTest()
    @MethodSource("drawCasesTestSets")
    @DisplayName("draw 기능을 테스트한다")
    void verifyDrawFunction(int A, int B) {
        String result = judgeWinner(A, B);
        assertThat(result).isEqualTo("D");
    }

    @ParameterizedTest()
    @MethodSource("winnerIsACasesTestSets")
    @DisplayName("winner A 기능을 테스트한다")
    void verifyWinnerIsAFunction(int A, int B) {
        String result = judgeWinner(A, B);
        assertThat(result).isEqualTo("A");
    }

    @ParameterizedTest()
    @MethodSource("winnerIsBCasesTestSets")
    @DisplayName("winner B 기능을 테스트한다")
    void verifyWinnerIsBFunction(int A, int B) {
        String result = judgeWinner(A, B);
        assertThat(result).isEqualTo("B");
    }

    private static Stream<Arguments> drawCasesTestSets() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(3, 3)
        );
    }

    private static Stream<Arguments> winnerIsACasesTestSets() {
        return Stream.of(
                Arguments.of(1, 3),
                Arguments.of(2, 1),
                Arguments.of(3, 2)
        );
    }

    private static Stream<Arguments> winnerIsBCasesTestSets() {
        return Stream.of(
                Arguments.of(1, 2),
                Arguments.of(2, 3),
                Arguments.of(3, 1)
        );
    }


    public static void main(String[] args) throws IOException {
        // TODO : 가위바위보 게임을 만들어보자
        // 맨 첫 줄에 케이스 횟수가 주어진다
        // 다음 줄에 A의 케이스가 주어진다
        // 다음 줄에 B의 케이스가 주어진다

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(bufferedReader.readLine());
        int[][] cases = new int[2][testCase];

        for (int i = 0; i < 2; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            for (int j = 0; j < testCase; j++) {
                cases[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        for (int i = 0; i < testCase; i++) {
            int A = cases[0][i];
            int B = cases[1][i];

            System.out.println(judgeWinner(A, B));
        }
    }

    private static String judgeWinner(int A, int B) {
        String a = "A";
        String b = "B";
        String draw = "D";

        // 1 = 가위
        // 2 = 바위
        // 3 = 보

        // 1, 2 => number2 win
        // 1, 3 => number1 win
        // 2, 3  => number2 win

        if (A == 1 && B == 2) {
            return b;
        }

        if (A == 1 && B == 3) {
            return a;
        }

        if (A == 2 && B == 3) {
            return b;
        }

        if (A == 2 && B == 1) {
            return a;
        }

        if (A == 3 && B == 1) {
            return b;
        }

        if (A == 3 && B == 2) {
            return a;
        }

        return draw;
    }
}
