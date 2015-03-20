package neal.fu.domain;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by icy_eidos on 14-4-15.
 */
public class OneRollChancesTest {
    @Test
    public void testEmpty() throws Exception {
        Chances chances = OneRollChances.empty();
        assertEquals("The empty OneRollChances is not correct!", "0: 1.0\n", chances.toString());
    }

    @Test
    public void testAdd() throws Exception {

    }

    @Test
    public void testAdd1() throws Exception {

    }
}
