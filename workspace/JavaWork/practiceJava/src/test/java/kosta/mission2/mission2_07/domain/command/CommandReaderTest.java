package kosta.mission2.mission2_07.domain.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CommandReaderTest {

    @Test
    void validate_Command_Is_Correctly_Received() {
        CommandReader commandReader = new CommandReader();
        assertThrows(InvalidCommandException.class, () -> commandReader.parseCommand(10));
    }

}