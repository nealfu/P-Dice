package neal.fu.domain;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @author neal.fu
 */
public class DiceTest {

    @Test(dataProvider = "providedData")
    public void testOneRollChances(int sides, double expected) throws Exception {

        Dice dice = new Dice(sides);
        Chances result = dice.oneRollChances();
        assertEquals("The chance is not correct!", expected, result.getChance(1), 0.0000000000000001);
    }

    @DataProvider(name = "providedData")
    public Object[][] provideData() {
        return new Object[][]{
                {1, 1.0 / 6},
                {2, 1.0 / 2},
                {5, 1.0 / 5},
                {6, 1.0 / 6}
        };
    }
}
