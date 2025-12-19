package Com.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class First_Jenkins_Test {

    @Test
    public void testAddition() {
        int result = add(4, 4);
        assertEquals(8, result);
    }

    // Make it a normal method, not a static inner class
    public int add(int a, int b) {
        return a + b;
    }
}
