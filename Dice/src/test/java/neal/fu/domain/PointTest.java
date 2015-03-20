package neal.fu.domain;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @author neal.fu
 */
public class PointTest {
    @Test
    public void testToString() throws Exception {
        Point point = new Point(7);
        assertEquals("", "Point: 7", point.toString());
    }
}
