package neal.fu.domain;

/**
 * @author neal.fu
 */
public class Dice implements Random {

    private static final int MIN_SIDES = 1;

    /*
     * the number of dice sides, default to 6
     */
    private int sides = 6;

    public Dice(int sides) {
        if (sides > MIN_SIDES) {
            this.sides = sides;
        }
    }

    @Override
    public OneRollChances oneRollChances() {
        OneRollChances oneRollChances = new OneRollChances();

        for (int i = MIN_SIDES; i <= sides; i++) {
            oneRollChances.add(i, 1.0 / sides);
        }
        return oneRollChances;
    }

    /*
     * not used
     */
    @Override
    public MultipleRollChances multipleRollChances(int maxPoints) {
        return null;
    }

}
