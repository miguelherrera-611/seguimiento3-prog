package ejercicio6;

public class Inventario {
    private Zapato zapato;
    private int talla;
    private int cantidad;

    public Inventario(Zapato zapato, int talla, int cantidad) {
        this.zapato = zapato;
        this.talla = talla;
        this.cantidad = cantidad;
    }

    public Zapato getZapato() {
        return zapato;
    }

    public void setZapato(Zapato zapato) {
        this.zapato = zapato;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void registrarEntrada(int cantidad) {
        this.cantidad += cantidad;
    }

    public void registrarSalida(int cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
        } else {
            System.out.println("No hay suficiente existencias.");
        }
    }
}
