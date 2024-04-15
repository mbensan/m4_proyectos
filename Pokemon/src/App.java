import pokemones.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Creamos 3 pokemones
        Pokemon p1 = new Pokemon("Charmander", 100, "Fuego");
        Pokemon p2 = new Pokemon("Chansey", 296, "Normal");

        // Creamos nuestra Pokedex
        Pokedex dex = new Pokedex();

        Pokemon p3 = dex.createPokemon("Gengar", 15, "Fantasma");

        // Añadimos los pokemones
        dex.addPokemon(p1);
        dex.addPokemon(p2);
        dex.addPokemon(p3);

        p1.attack(p3);

        dex.listPokemon();
    }
}
