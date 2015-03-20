package neal.fu.domain;

import java.util.LinkedList;
import java.util.List;

/**
 * @author neal.fu
 */
public class Dices implements Random {

    private final List<Dice> dices = new LinkedList<>();

    public int add(Dice dice) {
        dices.add(dice);
        return dices.size();
    }

    @Override
    public OneRollChances oneRollChances() {
        OneRollChances oneRollChances = OneRollChances.empty();

        for (Dice dice : dices) {
            oneRollChances = oneRollChances.add(dice.oneRollChances());
        }

        return oneRollChances;
    }

    @Override
    public MultipleRollChances multipleRollChances(int maxPoint) {
        OneRollChances oneRollChances = oneRollChances();

        MultipleRollChances multipleRollChances = new MultipleRollChances();

        for (int point = 1; point < maxPoint; point++) {
            multipleRollChances.add(point, calculateChance(oneRollChances, multipleRollChances, point));
        }

        return multipleRollChances;
    }

    private double calculateChance(OneRollChances oneRollChances, MultipleRollChances multipleRollChances, int point) {
        double totalChance = 0;

        for (int j = 1; j < point; j++) {
            double oneRollChance = oneRollChances.getChance(j);
            double multiRollChance = multipleRollChances.getChance(point - j);

            totalChance += oneRollChance * multiRollChance;
        }

        double oneRollChance = oneRollChances.getChance(point);
        totalChance += oneRollChance;

        return totalChance;
    }

}
