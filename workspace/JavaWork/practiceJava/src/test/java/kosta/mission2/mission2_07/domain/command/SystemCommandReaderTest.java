package kosta.mission2.mission2_07.domain.command;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

class SystemCommandReaderTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 10})
    void verify_Command_Is_Assigned_Number_Allowed_Only(int number) {
        SystemCommandReader systemCommandReader = new SystemCommandReader();
        assertThrows(InvalidCommandException.class, () -> systemCommandReader.parseCommand(number));
    }
}