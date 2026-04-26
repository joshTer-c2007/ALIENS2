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
        this.precioCuerpo = this.tamanio * 0.20;
        this.precioExtremidad = this.tamanio * 0.10;
        this.precioOjo = this.tamanio * 0.05;
        this.precioTotal = 0;
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
    
    public int getTamanio() { return tamanio; }
    public String getColor() { return color; }
    public int getNumeroOjos() { return numeroOjos; }
    public int getNumeroBrazos() { return numeroBrazos; }
    public int getNumeroPies() { return numeroPies; }
    public double getPrecioTotal() { return precioTotal; }
    
    public void imprimir() {
        System.out.println("Alien: " + color + " | Tamaño: " + tamanio + "cm");
        System.out.println("Precio Total: $" + precioTotal);
    }
}
