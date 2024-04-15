package pokemones;

public abstract class AbstractPokedex implements PokeInterface {
  @Override
  public Pokemon createPokemon(String name, int health, String type) {
    Pokemon p = new Pokemon(name, health, type);
    return p;
  }

  @Override
  public String pokemonInfo(Pokemon p) {
    String resp = "Nombre: " + p.getName();
    resp += "(salud: " + p.getHealth() + ", ";
    resp += "tipo: " + p.getType() + ")";

    return resp;
  }
}
