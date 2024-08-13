package ejercicio5;

public class Habitacion {
    private int numeroHabitacion;
    private double precioPorNoche;
    private boolean disponibilidad;
    private String huespedesAlojados;

    public Habitacion(int numeroHabitacion, double precioPorNoche, boolean disponibilidad, String huespedesAlojados) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioPorNoche = precioPorNoche;
        this.disponibilidad = disponibilidad;
        this.huespedesAlojados = huespedesAlojados;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getHuespedesAlojados() {
        return huespedesAlojados;
    }

    public void setHuespedesAlojados(String huespedesAlojados) {
        this.huespedesAlojados = huespedesAlojados;
    }

    public void mostrarDatos() {
        System.out.println("Número de Habitación: " + numeroHabitacion);
        System.out.println("Precio por Noche: " + precioPorNoche);
        System.out.println("Disponibilidad: " + (disponibilidad ? "Disponible" : "No Disponible"));
        System.out.println("Huéspedes Alojados: " + huespedesAlojados);
        System.out.println();
    }
}

