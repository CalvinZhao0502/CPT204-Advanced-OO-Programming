import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountRunsTest {
	
	// add test cases
    @Test
    public void testCase1() {
        List<Integer> list = Arrays.asList(1, 2,2,2, 3);
        assertEquals(1, CountRuns.countRuns(list));

    }
    @Test
    public void testCase2() {
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 5, 5);
        assertEquals(2, CountRuns.countRuns(list));
    }
    @Test
    public void testCase3() {
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 5, 5,6,6,7,7);
        assertEquals(4, CountRuns.countRuns(list));
    }
	
	
}