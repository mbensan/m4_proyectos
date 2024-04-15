package pokemones;

public class Pokemon {
  private String name;
  private int health;
  private String type;

  static int count = 0;

  public Pokemon(String name, int health, String type) {
    this.name = name;
    this.health = health;
    this.type = type;
    count += 1;
  }

  public void attack(Pokemon otro) {
    // otro.health -= 10;
    otro.setHealth(otro.getHealth() - 10);
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHealth() {
    return this.health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
