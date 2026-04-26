package Aliens;

public class Alien {
    private int tamanio;
    private String color;
    private int numeroOjos;
    private int numeroBrazos;
    private int numeroPies;
    private double precioExtremidad;
    private double precioOjo;
    private double precioCuerpo;
    private double precioTotal;

    public Alien(int tamanio, String color) {
        if (tamanio < 5) {
            this.tamanio = 5;
        } else if (tamanio > 30) {
            this.tamanio = 30;
        } else {
            this.tamanio = tamanio;
        }

        this.color = color;
        this.numeroOjos = 0;
        this.numeroBrazos = 0;
        this.numeroPies = 0;
        this.precioTotal = 0;

        this.precioCuerpo = this.tamanio * 0.20;
        this.precioExtremidad = this.tamanio * 0.10;
        this.precioOjo = this.tamanio * 0.05;
    }

    public boolean agregarBrazos(int cantidad) {
        if ((this.numeroBrazos + this.numeroPies + cantidad) <= 10) {
            this.numeroBrazos += cantidad;
            calcularPrecioTotal();
            return true;
        }
        return false;
    }

    public boolean agregarPiernas(int cantidad) {
        if ((this.numeroBrazos + this.numeroPies + cantidad) <= 10) {
            this.numeroPies += cantidad;
            calcularPrecioTotal();
            return true;
        }
        return false;
    }

    public boolean agregarOjos(int cantidad) {
        int maxOjos = 0;
        if (this.tamanio >= 5 && this.tamanio <= 10) maxOjos = 3;
        else if (this.tamanio > 10 && this.tamanio <= 20) maxOjos = 5;
        else if (this.tamanio > 20 && this.tamanio <= 30) maxOjos = 7;

        if ((this.numeroOjos + cantidad) <= maxOjos) {
            this.numeroOjos += cantidad;
            calcularPrecioTotal();
            return true;
        }
        return false;
    }

    private void calcularPrecioTotal() {
        this.precioTotal = precioCuerpo + 
                          ((numeroBrazos + numeroPies) * precioExtremidad) + 
                          (numeroOjos * precioOjo);
    }

    public int getTamanio() { return tamanio; }
    public String getColor() { return color; }
    public int getNumeroOjos() { return numeroOjos; }
    public int getNumeroBrazos() { return numeroBrazos; }
    public int getNumeroPies() { return numeroPies; }
    public double getPrecioTotal() { return precioTotal; }

    public void imprimir() {
        System.out.println("Alien: " + color + " | Tamaño: " + tamanio + "cm");
        System.out.println("Extremidades: " + (numeroBrazos + numeroPies) + " | Ojos: " + numeroOjos);
        System.out.println("Precio Total: $" + precioTotal);
    }
}
