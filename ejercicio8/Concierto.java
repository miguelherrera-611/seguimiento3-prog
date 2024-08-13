package ejercicio8;

public class Concierto {
    private Entrada[] entradasGenerales;
    private Entrada[] entradasVIP;
    private int contadorGeneral = 0;
    private int contadorVIP = 0;

    public Concierto(int maxGenerales, int maxVIP) {
        entradasGenerales = new Entrada[maxGenerales];
        entradasVIP = new Entrada[maxVIP];
    }

    public boolean verificarDisponibilidad(String zona) {
        if (zona.equals("GENERAL")) {
            return contadorGeneral < entradasGenerales.length;
        } else if (zona.equals("VIP")) {
            return contadorVIP < entradasVIP.length;
        }
        return false;
    }

    public Entrada venderEntrada(String zona, double valor) {
        if (zona.equals("GENERAL") && contadorGeneral < entradasGenerales.length) {
            Entrada entrada = new Entrada(contadorGeneral + 1, zona, valor);
            entradasGenerales[contadorGeneral++] = entrada;
            entrada.marcarComoVendida();
            return entrada;
        } else if (zona.equals("VIP") && contadorVIP < entradasVIP.length) {
            Entrada entrada = new Entrada(contadorVIP + 1, zona, valor);
            entradasVIP[contadorVIP++] = entrada;
            entrada.marcarComoVendida();
            return entrada;
        }
        return null;
    }

    public void registrarIngreso(int numero, String zona) {
        Entrada entrada = buscarEntrada(numero, zona);
        if (entrada != null) {
            entrada.marcarIngreso();
        }
    }

    private Entrada buscarEntrada(int numero, String zona) {
        if (zona.equals("GENERAL")) {
            if (contadorGeneral > 0) return entradasGenerales[0];
        } else if (zona.equals("VIP")) {
            if (contadorVIP > 0) return entradasVIP[0];
        }
        return null;
    }
}
