package kosta.mission2.mission2_07.domain.command;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CommandReaderTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 10})
    void verify_Command_Is_Assigned_Number_Allowed_Only(int number) {
        CommandReader commandReader = new CommandReader();
        assertThrows(InvalidCommandException.class, () -> commandReader.parseCommand(number));
    }
}