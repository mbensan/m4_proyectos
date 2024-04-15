package movil;

public class Ambulancia extends Vehiculo {

  public Ambulancia(int motor, String marca, String modelo, float rendimiento) {
    super(motor, marca, modelo, rendimiento);
  }

  public void sonarSirena() {
    System.out.println("WIU WIU WIU");
    // Thread.sleep(1000);
    System.out.println("PAPU PAPU");
    // Thread.sleep(1000);
    System.out.println("UUUIIIII");
  }

}
