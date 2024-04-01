import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Destino miami = new Destino("Miami", 7, 5000);

        // agregar3destinos();
        TVShow pepa = new TVShow("Pepa Pig", 5, 20, 0);
    }

    static public void agregar3destinos() {
        Scanner in = new Scanner(System.in);
        Destino[] destinos = new Destino[3];
        // 1. Vamos agregando los destinos
        for (int i = 0; i < destinos.length; i++) {
            System.out.println("Ingrese el nombre del destino");
            String nombre = in.nextLine();
            System.out.println("Ingrese el número de días del destino");
            int numDias = Integer.parseInt(in.nextLine());
            System.out.println("Ingrese el presupuesto del destino");
            float presupuesto = Float.parseFloat(in.nextLine());

            Destino nuevo = new Destino(nombre, numDias, presupuesto);

            destinos[i] = nuevo;
        }
        for (Destino dest : destinos) {
            double gastoDiario = dest.getGastoDiario();
            System.out.println("En " + dest.nombre + " gastaremos diariamente " + gastoDiario);
        }

    }
}
