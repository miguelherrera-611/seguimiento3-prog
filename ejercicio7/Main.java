package ejercicio7;

public class Main {
    public static void main(String[] args) {
        String[] temasLibro1 = {"Ficción", "Aventura"};
        String[] temasLibro2 = {"No Ficción", "Historia"};

        Libro libro1 = new Libro("978-3-16-148410-0", "El Gran Mundo De Arle", "Samuel jaramillo", 2021, "los arles", 300, temasLibro1);
        Libro libro2 = new Libro("978-1-23-456789-0", "La Historia del Samuel", "manuel muños", 2019, "los morales", 250, temasLibro2);

        Usuario usuario1 = new Usuario("Juan Pérez", "109738278", "3164386836");
        Usuario usuario2 = new Usuario("Ana Gómez", "102986483", "323457867");

        Prestamo prestamo1 = new Prestamo(libro1.getIsbn(), usuario1.getIdentificacion(), new java.util.Date(), null);
        Prestamo prestamo2 = new Prestamo(libro2.getIsbn(), usuario2.getIdentificacion(), new java.util.Date(), null);

        System.out.println("Datos del Libro 1:");
        libro1.mostrarDatos();

        System.out.println("Datos del Libro 2:");
        libro2.mostrarDatos();

        System.out.println("Datos del Usuario 1:");
        usuario1.mostrarDatos();

        System.out.println("Datos del Usuario 2:");
        usuario2.mostrarDatos();

        System.out.println("Datos del Préstamo 1:");
        prestamo1.mostrarDatos();

        System.out.println("Datos del Préstamo 2:");
        prestamo2.mostrarDatos();
    }
}

