package pokemones;

import java.util.ArrayList;

public class Pokedex extends AbstractPokedex {

  ArrayList<Pokemon> pokemones = new ArrayList<Pokemon>();

  public void listPokemon() {
    for (Pokemon p : pokemones) {
      String descripcion_p = pokemonInfo(p);
      System.out.println(descripcion_p);
    }
  }

  public void addPokemon(Pokemon p) {
    pokemones.add(p);
  }

}
