package ejercicio6;

import java.util.Date;

public class Venta {
    private Date fecha;
    private Zapato zapato;
    private int talla;
    private int cantidad;
    private double valor;

    public Venta(Date fecha, Zapato zapato, int talla, int cantidad) {
        this.fecha = fecha;
        this.zapato = zapato;
        this.talla = talla;
        this.cantidad = cantidad;
        this.valor = calcularTotal();
    }

    public double calcularTotal() {
        return zapato.getPrecio() * cantidad;
    }

    public void imprimirDetalle() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Zapato: " + zapato.getNombre());
        System.out.println("Talla: " + talla);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Valor Total: " + valor);
        System.out.println();
    }
}
