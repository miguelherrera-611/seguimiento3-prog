package ejercicio5;

public class Main {
    public static void main(String[] args) {
        Habitacion habitacion1 = new Habitacion(101, 75.0, true, "no se han registrado huéspedes");
        Habitacion habitacion2 = new Habitacion(102, 85.0, true, "no se han registrado huéspedes");
        Habitacion habitacion3 = new Habitacion(103, 95.0, false, "Arle morales");
        Habitacion habitacion4 = new Habitacion(104, 65.0, true, "no se han registrado huéspedes");
        Habitacion habitacion5 = new Habitacion(105, 105.0, false, "Julio Jaramillo");

        Habitacion[] habitaciones = { habitacion1, habitacion2, habitacion3, habitacion4, habitacion5 };

        habitacion1.mostrarDatos();
        habitacion2.mostrarDatos();
        habitacion3.mostrarDatos();
        habitacion4.mostrarDatos();
        habitacion5.mostrarDatos();

        habitacion1.setPrecioPorNoche(80.0);
        habitacion1.setDisponibilidad(false);

        System.out.println("Datos actualizados de la habitación 101:");
        habitacion1.mostrarDatos();
    }
}

