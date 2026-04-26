package Aliens;

public class TestConstructores {
    public static void main(String[] args) {
        Alien a1 = new Alien(2, "Verde");
        a1.agregarBrazos(2);
        a1.agregarOjos(1);
        a1.imprimir();

        Alien a2 = new Alien(50, "Rojo");
        a2.agregarPiernas(4);
        a2.agregarOjos(6);
        a2.imprimir();
    }
}