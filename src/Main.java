import moves.ghost.ShadowBall;
import moves.normal.Recover;
import pokemon.PokemonMove;

/**
 * Created by Mostafa on 5/16/2017.
 */

public class Main {

    public static void main(String[] args) {
        PokemonMove move = new ShadowBall();
        PokemonMove move2 = new Recover();
        System.out.println(move2.equals(move));
    }
}
