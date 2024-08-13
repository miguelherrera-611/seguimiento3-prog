package ejercicio2;

public class GestionAcademica {
    private String nombres;
    private String apellidos;
    private int grado;
    private int edad;
    private double promedioAcademico;
    private String nombreMadre;
    private String nombrePadre;
    private java.util.List<String> telefonosContactos;

    public GestionAcademica(String nombres, String apellidos, int grado, int edad, double promedioAcademico,
                      String nombreMadre, String nombrePadre) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.grado = grado;
        this.edad = edad;
        this.promedioAcademico = promedioAcademico;
        this.nombreMadre = nombreMadre;
        this.nombrePadre = nombrePadre;
        this.telefonosContactos = new java.util.ArrayList<>();
    }

    public GestionAcademica(String nombres, String apellidos, int grado, int edad, double promedioAcademico,
                      String nombreMadre, String nombrePadre, java.util.List<String> telefonosContactos) {
        this(nombres, apellidos, grado, edad, promedioAcademico, nombreMadre, nombrePadre);
        this.telefonosContactos = telefonosContactos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedioAcademico() {
        return promedioAcademico;
    }

    public void setPromedioAcademico(double promedioAcademico) {
        this.promedioAcademico = promedioAcademico;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public java.util.List<String> getTelefonosContactos() {
        return telefonosContactos;
    }

    public void setTelefonosContactos(java.util.List<String> telefonosContactos) {
        this.telefonosContactos = telefonosContactos;
    }

    public void imprimirDetalles() {
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Grado: " + grado);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio Académico: " + promedioAcademico);
        System.out.println("Nombre de la Madre: " + nombreMadre);
        System.out.println("Nombre del Padre: " + nombrePadre);
        System.out.println("Teléfonos de Contacto: " + (telefonosContactos.isEmpty() ? "N/A" : String.join(", ", telefonosContactos)));
        System.out.println();
    }
}

