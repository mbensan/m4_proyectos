package rol;

public class Wizard extends Human {

  public Wizard(String name) {
    super(name);
    this.health = 50;
    this.intelligence = 8;
  }

  public void heal(Human target) {
    int newHealth = target.getHealth() + this.intelligence;
    target.setHealth(newHealth);
  }

  public void fireball(Human target) {
    int newHealth = target.getHealth() - (3 * this.intelligence);
    target.setHealth(newHealth);
  }

}
