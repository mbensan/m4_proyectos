package pokemones;

public interface PokeInterface {

  Pokemon createPokemon(String name, int health, String type);

  String pokemonInfo(Pokemon pokemon);

  void listPokemon();

}
