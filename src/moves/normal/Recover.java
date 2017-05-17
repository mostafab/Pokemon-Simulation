package moves.normal;

import pokemon.Pokemon;
import pokemon.PokemonMove;
import pokemon.PokemonType;

import java.util.Set;

/**
 * Created by Mostafa on 5/16/2017.
 */
public class Recover extends PokemonMove {

    public Recover() {
        super("Recover", PokemonType.NORMAL);
    }

    public void execute(Pokemon source, Pokemon target, Set<Pokemon> allies, Set<Pokemon> enemies) {

    }
}
