import movil.*;

public class App {
  public static void main(String[] args) throws Exception {
    Moto m = new Moto(150, "Suzuki", "GSX", 47, false);
    Vehiculo v = new Vehiculo(1200, "Kia", "Morning", 18);
    Ambulancia a = new Ambulancia(4000, "Mercedes Benz", "Amb320", 10);

    Vehiculo[] vehiculos = { m, v, a };
    for (Vehiculo x : vehiculos) {
      System.out.println("Para recorrer 100 Km en %s voy a consumir %s litros de combustible".formatted(x.getNombre(),
          x.getConsumo(100)));
    }
  }
}
