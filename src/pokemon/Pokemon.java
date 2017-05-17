package pokemon;

import java.util.Set;

/**
 * Created by Mostafa on 5/16/2017.
 */
public abstract class Pokemon {

    private String name;
    private Set<PokemonType> pokemonTypes;
    private Set<PokemonMove> pokemonMoves;

    public Pokemon(String name, Set<PokemonType> types, Set<PokemonMove> moves) {
        this.name = name;
        pokemonTypes = types;
        pokemonMoves = moves;
    }

    public String getName() {
        return name;
    }

    public Set<PokemonType> getPokemonTypes() {
        return pokemonTypes;
    }

    public Set<PokemonMove> getPokemonMoves() { return pokemonMoves; }
}
