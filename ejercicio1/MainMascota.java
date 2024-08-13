package ejercicio1;

public class MainMascota {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Arle", 5, "pug", "Negro");
        Mascota mascota2 = new Mascota("Samuel", 3, "chihuahua", "Blanco");
        Mascota mascota3 = new Mascota("manuel", 2, "caniche", "Gris");

        System.out.println("Detalles de las mascotas:");
        mascota1.detalles();
        mascota2.detalles();
        mascota3.detalles();

        mascota1.setEdad(6);
        mascota1.setColor("cafe");

        System.out.println("Detalles actualizados de las mascotas:");
        mascota1.detalles();
        mascota2.detalles();
        mascota3.detalles();
    }
}

