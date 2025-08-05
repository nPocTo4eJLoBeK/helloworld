package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {


    @Test
    void testFoo() {
        assertEquals(10, 5 << 1);
        assertEquals(2, 5 >> 1);

    }
}
