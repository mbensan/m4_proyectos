package rol;

public class Samurai extends Human {

  static int numSamurai = 0;

  public Samurai(String nombre) {
    super(nombre);
    this.health = 200;
    // aumentar el número de Samurai's
    numSamurai += 1;
  }

  public static int howMany() {
    return numSamurai;
  }

  public void deathBlow(Human target) {
    // 1. matar al oponente
    target.setHealth(0);
    // 2. disminuír mi salud a la mitad
    this.health = Math.round(this.health / 2);
  }

  public void meditate() {
    this.health = Math.round(this.health * 1.5);
  }
}
