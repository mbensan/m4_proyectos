package rol;

public class Ninja extends Human {

  public Ninja(String name) {
    super(name);
    this.stealth = 10;
  }

  public void steal(Human target) {
    // 1. Le robo al humano "target" salud, en una cantidad igual a mi sigilo
    int newHealth = target.getHealth() - this.stealth;
    target.setHealth(newHealth);
    // 2. me sumo esa salud a mi mismo
    this.health = this.health + this.stealth;
  }

  public void runAway() {
    this.health = this.health - this.stealth;
  }
}
