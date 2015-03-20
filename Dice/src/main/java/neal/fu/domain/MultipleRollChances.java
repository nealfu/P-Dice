package neal.fu.domain;

/**
 * @author neal.fu
 */
class MultipleRollChances extends Chances {

    @Override
    public void add(int point, double chance) {
        if (chance != 0) {
            chances.put(point, chance);
        }
    }

}
