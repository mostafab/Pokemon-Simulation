package pokemon;

/**
 * Created by Mostafa on 5/16/2017.
 */
public abstract class PokemonMove implements PokemonMoveResult {

    private String name;
    private PokemonType type;

    public PokemonMove(String name, PokemonType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public PokemonType getType() {
        return type;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof PokemonMove)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        PokemonMove move = (PokemonMove) other;
        return this.name.equals(move.getName())
                && this.type.equals(move.getType());
    }

}
