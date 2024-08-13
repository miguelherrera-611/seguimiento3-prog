package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Propiedad propiedad1 = new Propiedad("P001", "toledo 123", 120.5, 250000.0, 3, 2, true, "Disponible");
        Propiedad propiedad2 = new Propiedad("P002", "casique 742", 150.0, 320000.0, 4, 3, false, "Vendida");
        Propiedad propiedad3 = new Propiedad("P003", "caramanta 456", 90.0, 180000.0, 2, 1, true, "Rentada");

        propiedad1.mostrarDatos();
        propiedad2.mostrarDatos();
        propiedad3.mostrarDatos();

        propiedad1.setEstado("Vendida");
        System.out.println("Datos actualizados de la propiedad 1:");
        propiedad1.mostrarDatos();
    }
}

