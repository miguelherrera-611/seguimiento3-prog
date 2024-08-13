package ejercicio2;

public class MainGestionAcademica {
    public static void main(String[] args) {
        java.util.List<String> telefonos1 = new java.util.ArrayList<>();
        GestionAcademica estudiante1 = new GestionAcademica(
                "Miguel Angel", "Herrera", 11, 17, 8.5, "manuela Herrera", "Arle Herrera"
        );

        java.util.List<String> telefonos2 = new java.util.ArrayList<>();
        telefonos2.add("123456789");
        GestionAcademica estudiante2 = new GestionAcademica(
                "samuel", "Gómez", 8, 13, 9.2, "Laura Gómez", "Miguel Gómez",
                telefonos2
        );

        java.util.List<String> telefonos3 = new java.util.ArrayList<>();
        telefonos3.add("987654321");
        telefonos3.add("123123123");
        GestionAcademica estudiante3 = new GestionAcademica(
                "manuel jose", "muñoz", 11, 16, 7.8, "Elena Muñoz", "Roberto Muñoz",
                telefonos3
        );

        System.out.println("Detalles de los estudiantes:");
        estudiante1.imprimirDetalles();
        estudiante2.imprimirDetalles();
        estudiante3.imprimirDetalles();
    }
}
