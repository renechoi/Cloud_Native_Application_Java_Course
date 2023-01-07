package kosta.toyMission.baseball.domain.computer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

class ComputerNumberGeneratorTest {

    ComputerNumberGenerator computerNumberGenerator;

    @BeforeEach
    void setUp() {
        this.computerNumberGenerator = new ComputerNumberGenerator();
    }

    @DisplayName("랜덤 생성 숫자 범위를 검증한다")
    @RepeatedTest(100)
    void verify_RandomNumber_Correctly_Ranged() {
        int randomNumber = computerNumberGenerator.generateRandomNumber();
        assertThat(randomNumber).isBetween(1, 9);
    }

    @DisplayName("랜섬 숫자의 유효성을 검증한다")
    @RepeatedTest(100)
    void verify_RandomNumber_Correctly_Generated() {
        List<Integer> numbersBatched = Arrays.asList(new Integer[10]);

        for (int i = 0; i < 100; i++) {
            int randomNumber = computerNumberGenerator.generateRandomNumber();
            numbersBatched.set(randomNumber, 1);
        }

        int actual = numbersBatched.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .sum();
        int expected = 9;
        assertThat(actual).isEqualTo(expected);
    }
}