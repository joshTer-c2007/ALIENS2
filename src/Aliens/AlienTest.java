package Aliens;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AlienTest {
    @Test
    void testTamanio() {
        Alien a = new Alien(2, "Verde");
        assertEquals(5, a.getTamanio());
    }
}