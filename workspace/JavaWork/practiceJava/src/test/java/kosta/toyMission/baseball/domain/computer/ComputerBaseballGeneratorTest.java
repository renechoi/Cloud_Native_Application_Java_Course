package kosta.toyMission.baseball.domain.computer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ComputerBaseballGeneratorTest {

    @DisplayName("생성된 최종 숫자의 중복 없음을 검증한다")
    @Test
    void verify_Computer_Baseball_Generation(){

        ComputerBaseballGenerator computerBaseballGenerator =new ComputerBaseballGenerator(new ComputerNumberGenerator());
        Baseball baseball =  computerBaseballGenerator.makeBaseball(3);
        int actual = baseball.toNumbers().size();
        int expected = (int) baseball.toNumbers().stream().distinct().count();

        assertThat(actual).isEqualTo(expected);
    }
}