package neal.fu.domain;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author neal.fu
 */
class OneRollChances extends Chances {

    public static OneRollChances empty() {
        OneRollChances oneRollChances = new OneRollChances();
        oneRollChances.add(0, 1);
        return oneRollChances;
    }

    @Override
    public void add(int point, double chance) {

        Double oldChance = chances.get(point);

        if (oldChance == null) {
            chances.put(point, chance);
        } else {
            chances.put(point, oldChance + chance);
        }
    }

    public OneRollChances add(OneRollChances oneRollChances) {

        OneRollChances updatedOneRollChances = new OneRollChances();

        for (Entry<Integer, Double> entry : getEntrySet()) {
            for (Entry<Integer, Double> added : oneRollChances.getEntrySet()) {
                updatedOneRollChances.add(entry.getKey() + added.getKey(), entry.getValue() * added.getValue());
            }
        }

        return updatedOneRollChances;
    }

    private Set<Entry<Integer, Double>> getEntrySet() {
        return this.chances.entrySet();
    }

}
