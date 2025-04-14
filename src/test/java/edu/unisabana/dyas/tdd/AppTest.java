package edu.unisabana.dyas.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testSumaBasica() {
        int resultado = 2 + 2;
        assertEquals(4, resultado, "2 + 2 debería ser 4");
    }
}
