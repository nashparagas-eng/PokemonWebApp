package ph.edu.dlsu.lbycpob.pokemonwebapp.model;

import java.util.concurrent.atomic.AtomicInteger;

// Pokemon Factory
public class PokemonFactory {
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static Pokemon createPokemon(String name, double weight, double height,
                                        double attack, double defense, double stamina, String type) {
}
