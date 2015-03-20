package neal.fu.domain;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @author neal.fu
 */
public class DicesTest {
    @Test
    public void testAdd() throws Exception {
        Dices dices = new Dices();
        assertEquals("Dice is not added to dices!", 1, dices.add(new Dice(6)));
        assertEquals("Dice is not added to dices!", 2, dices.add(new Dice(6)));
    }

    @Test
    public void testOneRollChances() throws Exception {

    }

    @Test
    public void testMultipleRollChances() throws Exception {

    }
}
