package com.bootCamp.logger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoggerTest {

    @Test
    void shouldReturnTextFromConsole() {
        String text = "This is something.";
        Console console = new Console();
        Logger logger = new Logger(console);
        String expected = "Console : " + text;
        assertEquals(expected, logger.log(text));
    }

    @Test
    void shouldReturnTextFromLogfile() {
        String text = "This is something.";
        Logfile logfile = new Logfile();
        Logger logger = new Logger(logfile);
        String expected = "Logfile : " + text;
        assertEquals(expected, logger.log(text));
    }
}