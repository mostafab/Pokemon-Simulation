package pokemon;

/**
 * Created by Mostafa on 5/16/2017.
 */
public enum PokemonTypeMatchupResult {

    NO_EFFECT(0),
    INEFFECTIVE(.5),
    NORMAL_EFFECT(1),
    SUPER_EFFECTIVE(2);

    private double multiplier;

    PokemonTypeMatchupResult(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() { return multiplier; }
}
