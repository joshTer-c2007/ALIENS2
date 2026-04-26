package Aliens;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AlienTest {
    @Test
    void testTamanio() {
        Alien a = new Alien(2, "Verde");
        assertEquals(5, a.getTamanio());
    }
    @Test
    void testTodo() {
        Alien a = new Alien(10, "Gris");
        a.agregarBrazos(2);
        a.agregarOjos(1);
        // Precio: Cuerpo(2.0) + 2 Extremidades(2.0) + 1 Ojo(0.5) = 4.5
        assertEquals(4.5, a.getPrecioTotal());
    }
}