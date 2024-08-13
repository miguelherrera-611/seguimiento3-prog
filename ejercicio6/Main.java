package ejercicio6;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Zapato zapato1 = new Zapato("Zapato Deportivo", "Negro", "Cuero", 120.0, "Primavera/Verano");
        Zapato zapato2 = new Zapato("Zapato Casual", "Cafe", "Sintético", 90.0, "Otoño/Invierno");
        Zapato zapato3 = new Zapato("Zapato Formal", "Negro", "Cuero", 150.0, "Primavera/Verano");
        Zapato zapato4 = new Zapato("Zapato Deportivo", "Azul", "Malla", 110.0, "Primavera/Verano");
        Zapato zapato5 = new Zapato("Zapato Casual", "beige", "Cuero", 100.0, "Otoño/Invierno");

        Inventario inventario1 = new Inventario(zapato1, 40, 10);
        Inventario inventario2 = new Inventario(zapato1, 41, 8);
        Inventario inventario3 = new Inventario(zapato2, 42, 15);
        Inventario inventario4 = new Inventario(zapato3, 43, 5);
        Inventario inventario5 = new Inventario(zapato4, 40, 7);
        Inventario inventario6 = new Inventario(zapato5, 41, 12);

        Venta venta1 = new Venta(new Date(), zapato1, 40, 2);
        Venta venta2 = new Venta(new Date(), zapato2, 42, 1);
        Venta venta3 = new Venta(new Date(), zapato4, 40, 1);

        venta1.imprimirDetalle();
        venta2.imprimirDetalle();
        venta3.imprimirDetalle();

        inventario1.registrarSalida(2);
        inventario3.registrarSalida(1);
        inventario5.registrarSalida(1);

        System.out.println("Inventario actual:");
        System.out.println("Zapato: " + inventario1.getZapato().getNombre() + ", Talla: " + inventario1.getTalla() + ", Cantidad en Stock: " + inventario1.getCantidad());
        System.out.println("Zapato: " + inventario2.getZapato().getNombre() + ", Talla: " + inventario2.getTalla() + ", Cantidad en Stock: " + inventario2.getCantidad());
        System.out.println("Zapato: " + inventario3.getZapato().getNombre() + ", Talla: " + inventario3.getTalla() + ", Cantidad en Stock: " + inventario3.getCantidad());
        System.out.println("Zapato: " + inventario4.getZapato().getNombre() + ", Talla: " + inventario4.getTalla() + ", Cantidad en Stock: " + inventario4.getCantidad());
        System.out.println("Zapato: " + inventario5.getZapato().getNombre() + ", Talla: " + inventario5.getTalla() + ", Cantidad en Stock: " + inventario5.getCantidad());
        System.out.println("Zapato: " + inventario6.getZapato().getNombre() + ", Talla: " + inventario6.getTalla() + ", Cantidad en Stock: " + inventario6.getCantidad());
    }
}

