package ejercicio8;

public class Main {
    public static void main(String[] args) {
        Concierto concierto = new Concierto(5, 3);

        System.out.println("Verificar disponibilidad General: " + concierto.verificarDisponibilidad("General"));
        System.out.println("Verificar disponibilidad VIP: " + concierto.verificarDisponibilidad("VIP"));

        Entrada entrada1 = concierto.venderEntrada("General", 50.0);
        Entrada entrada2 = concierto.venderEntrada("VIP", 100.0);
        Entrada entrada3 = concierto.venderEntrada("GeneralAL", 50.0);
        Entrada entrada4 = concierto.venderEntrada("General", 50.0);
        Entrada entrada5 = concierto.venderEntrada("General", 50.0);

        System.out.println("Verificar disponibilidad general después de vender: " + concierto.verificarDisponibilidad("General"));
        System.out.println("Verificar disponibilidad VIP después de vender: " + concierto.verificarDisponibilidad("VIP"));

        concierto.registrarIngreso(1, "General");
        concierto.registrarIngreso(2, "VIP");

        if (entrada1 != null) entrada1.mostrarDatos();
        if (entrada2 != null) entrada2.mostrarDatos();
        if (entrada3 != null) entrada3.mostrarDatos();
        if (entrada4 != null) entrada4.mostrarDatos();
        if (entrada5 != null) entrada5.mostrarDatos();
    }
}
