package ejercicio8;

public class Entrada {
    private int numero;
    private String zona;
    private double valor;
    private boolean vendida;
    private boolean ingresada;

    public Entrada(int numero, String zona, double valor) {
        this.numero = numero;
        this.zona = zona;
        this.valor = valor;
        this.vendida = false;
        this.ingresada = false;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getZona() { return zona; }
    public void setZona(String zona) { this.zona = zona; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public boolean isVendida() { return vendida; }
    public void marcarComoVendida() { this.vendida = true; }

    public boolean isIngresada() { return ingresada; }
    public void marcarIngreso() { this.ingresada = true; }

    public void mostrarDatos() {
        System.out.println("Número: " + numero);
        System.out.println("Zona: " + zona);
        System.out.println("Valor: " + valor);
        System.out.println("Vendida: " + (vendida ? "Sí" : "No"));
        System.out.println("Ingresada: " + (ingresada ? "Sí" : "No"));
    }
}
