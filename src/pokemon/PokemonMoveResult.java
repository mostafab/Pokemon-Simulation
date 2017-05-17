package pokemon;

import pokemon.Pokemon;

import java.util.Set;

/**
 * Created by Mostafa on 5/16/2017.
 */
public interface PokemonMoveResult {

    void execute(Pokemon source, Pokemon target, Set<Pokemon> allies, Set<Pokemon> enemies);
}
