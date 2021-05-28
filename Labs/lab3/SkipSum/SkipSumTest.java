import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SkipSumTest {
    @Test
    public void test1() {

        assertEquals(true, SkipSum.skipSum(Arrays.asList(2, 5, 10, 6), 12));
    }
    @Test
    public void test2() {
        assertEquals(false, SkipSum.skipSum(Arrays.asList(2, 5, 10, 6), 7));
    }

    public void test3() {
        assertEquals(false, SkipSum.skipSum(Arrays.asList(2, 5, 10, 6), 16));
    }
	
}
