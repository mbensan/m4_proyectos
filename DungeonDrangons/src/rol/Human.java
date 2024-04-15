package rol;

public class Human {
  public String name;
  private int strength;
  protected int intelligence;
  protected int stealth;
  protected int health;

  public String toString() {
    String retorno = "Human: %s (%s HP)".formatted(this.name, this.health);
    return retorno;
  }

  public Human(String name) {
    this.name = name;
    this.strength = 5;
    this.intelligence = 5;
    this.stealth = 5;
    this.health = 100;
  }

  public Human(String name, int health) {
    this.name = name;
    this.strength = 5;
    this.intelligence = 5;
    this.stealth = 5;
    this.health = health;
  }

  public int getHealth() {
    return this.health;
  }

  public void setHealth(int newHealth) {
    this.health = newHealth;
  }

  public void attack(Human victim) {
    int newVictimHealth = victim.getHealth() - this.strength;
    victim.setHealth(newVictimHealth);
  }

  public void heal(Human target) throws Exception {
    heal(target, 5);
  }

  public void heal(Human target, int points) throws Exception {
    if (this.health <= points) {
      throw new Exception("No tiene la suficiente vida para sanar");
    }
    // 1. Me resto a mi mismo 'points' de salud
    this.health = this.health - points;
    // 2. Le sumo a 'target' los 'points' de salud
    int newTargetHealth = target.getHealth() + points;
    target.setHealth(newTargetHealth);
  }

}
