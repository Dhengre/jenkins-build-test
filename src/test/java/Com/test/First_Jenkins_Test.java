package Com.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class First_Jenkins_Test {

    @Test
    public void testAddition() {
        int result = add(2, 3);
        assertEquals(5, result);
    }

    // Make it a normal method, not a static inner class
    public int add(int a, int b) {
        return a + b;
    }
}
