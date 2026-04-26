package Aliens;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AlienTest {
    @Test
    void testRestriccionTamanio() {
        Alien a1 = new Alien(2, "Verde");
        assertEquals(5, a1.getTamanio());
        Alien a2 = new Alien(50, "Rojo");
        assertEquals(30, a2.getTamanio());
    }

    @Test
    void testLimiteExtremidades() {
        Alien a = new Alien(15, "Azul");
        assertTrue(a.agregarBrazos(5));
        assertTrue(a.agregarPiernas(5));
        assertFalse(a.agregarBrazos(1));
    }

    @Test
    void testLimiteOjosPorTamanio() {
        Alien a = new Alien(8, "Gris");
        assertTrue(a.agregarOjos(3));
        assertFalse(a.agregarOjos(1));
    }

    @Test
    void testPrecioTotal() {
        Alien a = new Alien(10, "Negro");
        a.agregarBrazos(2);
        a.agregarOjos(1);
        assertEquals(4.5, a.getPrecioTotal());
    }
}