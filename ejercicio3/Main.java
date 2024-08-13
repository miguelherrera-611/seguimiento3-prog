package ejercicio3;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000.00, true, "clave123");
        cuenta.mostrarMenu();
    }
}