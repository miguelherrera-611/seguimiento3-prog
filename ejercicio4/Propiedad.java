package ejercicio4;

public class Propiedad {
    private String idPropiedad;
    private String direccion;
    private double areaM2;
    private double precio;
    private int cantidadHabitaciones;
    private int cantidadBanos;
    private boolean garaje;
    private String estado;

    public Propiedad(String idPropiedad, String direccion, double areaM2, double precio,
                     int cantidadHabitaciones, int cantidadBanos, boolean garaje, String estado) {
        this.idPropiedad = idPropiedad;
        this.direccion = direccion;
        this.areaM2 = areaM2;
        this.precio = precio;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.cantidadBanos = cantidadBanos;
        this.garaje = garaje;
        this.estado = estado;
    }

    public String getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(String idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getAreaM2() {
        return areaM2;
    }

    public void setAreaM2(double areaM2) {
        this.areaM2 = areaM2;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getCantidadBanos() {
        return cantidadBanos;
    }

    public void setCantidadBanos(int cantidadBanos) {
        this.cantidadBanos = cantidadBanos;
    }

    public boolean isGaraje() {
        return garaje;
    }

    public void setGaraje(boolean garaje) {
        this.garaje = garaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarDatos() {
        System.out.println("ID de Propiedad: " + idPropiedad);
        System.out.println("Dirección: " + direccion);
        System.out.println("Área en m2: " + areaM2);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad de Habitaciones: " + cantidadHabitaciones);
        System.out.println("Cantidad de Baños: " + cantidadBanos);
        System.out.println("Garaje: " + (garaje ? "Sí" : "No"));
        System.out.println("Estado: " + estado);
        System.out.println();
    }
}

