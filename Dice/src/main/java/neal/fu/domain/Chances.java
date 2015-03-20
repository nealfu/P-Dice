package neal.fu.domain;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author neal.fu
 */
public abstract class Chances {

    protected final Map<Integer, Double> chances = new HashMap<>();

    public double getChance(int point) {

        Double chance = chances.get(point);
        if (chance == null) {
            return 0;
        }

        return chance;
    }

    abstract void add(int point, double chance);

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Entry<Integer, Double> entry : chances.entrySet()) {
            builder.append(entry.getKey() + ": " + entry.getValue() + "\n");
        }

        return builder.toString();
    }

    public List<Point> getPointsOfMaxChance() {

        List<Point> points = new LinkedList<>();

        double maxValue = 0;

        for (Entry<Integer, Double> entry : chances.entrySet()) {
            Double value = entry.getValue();

            if (value > maxValue) {
                points.clear();
                points.add(new Point(entry.getKey()));

                maxValue = value;
            } else if (value == maxValue) {
                points.add(new Point(entry.getKey()));
            }
        }

        return points;
    }
}
