package Aliens;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AlienTest {
    @Test
    void testRestriccionTamanio() {
        Alien aBajo = new Alien(2, "Verde");
        assertEquals(5, aBajo.getTamanio()); // Ajuste automático a 5 [cite: 35, 37]
        
        Alien aAlto = new Alien(50, "Rojo");
        assertEquals(30, aAlto.getTamanio()); // Ajuste automático a 30 [cite: 36, 37]
    }

    @Test
    void testLimiteExtremidades() {
        Alien a = new Alien(15, "Azul");
        assertTrue(a.agregarBrazos(5));
        assertTrue(a.agregarPiernas(5));
        assertFalse(a.agregarBrazos(1)); // Falla porque 5+5+1 > 10 [cite: 71, 74]
    }

    @Test
    void testLimiteOjosPorTamanio() {
        Alien aPequenio = new Alien(8, "Gris");
        assertTrue(aPequenio.agregarOjos(3));
        assertFalse(aPequenio.agregarOjos(1)); // Límite de 3 ojos para 5-10cm [cite: 90, 93]
    }

    @Test
    void testCalculoPrecioTotal() {
        Alien a = new Alien(10, "Negro"); 
        // Precio Cuerpo: 10 * 0.20 = 2.0 [cite: 39]
        // Precio 2 Brazos: 2 * (10 * 0.10) = 2.0 [cite: 41]
        // Precio 1 Ojo: 1 * (10 * 0.05) = 0.5 [cite: 42]
        a.agregarBrazos(2);
        a.agregarOjos(1);
        assertEquals(4.5, a.getPrecioTotal()); // 2.0 + 2.0 + 0.5 = 4.5 [cite: 100, 111]
    }
}