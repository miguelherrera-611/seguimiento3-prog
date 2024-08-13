package ejercicio3;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private boolean estado;
    private String claveSeguridad;

    public CuentaBancaria(String numeroCuenta, double saldo, boolean estado, String claveSeguridad) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.estado = estado;
        this.claveSeguridad = claveSeguridad;
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    public void retirarEfectivo(double valor) {
        if (estado && valor <= saldo) {
            saldo -= valor;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else if (!estado) {
            System.out.println("La cuenta está inactiva.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void consignarEfectivo(double valor) {
        if (estado) {
            saldo += valor;
            System.out.println("Consignación exitosa. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cuenta está inactiva.");
        }
    }

    public void cambiarClave() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese la clave actual: ");
        String claveActual = scanner.nextLine();
        if (claveActual.equals(claveSeguridad)) {
            System.out.print("Ingrese la nueva clave: ");
            String nuevaClave = scanner.nextLine();
            claveSeguridad = nuevaClave;
            System.out.println("Clave cambiada exitosamente.");
        } else {
            System.out.println("Clave actual incorrecta.");
        }
    }

    public void mostrarMenu() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Menú del Cajero Electrónico:");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar efectivo");
        System.out.println("3. Consignar efectivo");
        System.out.println("4. Cambiar clave");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                consultarSaldo();
                break;
            case 2:
                System.out.print("Ingrese el monto a retirar: ");
                double retiro = scanner.nextDouble();
                scanner.nextLine();
                retirarEfectivo(retiro);
                break;
            case 3:
                System.out.print("Ingrese el monto a consignar: ");
                double consignacion = scanner.nextDouble();
                scanner.nextLine();
                consignarEfectivo(consignacion);
                break;
            case 4:
                cambiarClave();
                break;
            case 5:
                System.out.println("Gracias por usar el cajero. ¡Hasta luego!");
                return;
            default:
                System.out.println("Opción no válida.");
        }

        mostrarMenu();
    }
}
