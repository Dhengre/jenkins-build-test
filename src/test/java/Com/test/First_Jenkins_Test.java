package Com.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class First_Jenkins_Test {

    // method under test
    public int add(int a, int b) {
        return a + b;
    }

    @Test
    public void testAdd() {
        First_Jenkins_Test calc = new First_Jenkins_Test();
        assertEquals(12, calc.add(6, 6));
    }
}
