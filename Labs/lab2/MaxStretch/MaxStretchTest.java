import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxStretchTest {

    @Test
    public void testSingleMaxStretch() {
        List<Integer> list = Arrays.asList(8, 5, 1, 2, 3, 4, 5, 8);
        assertEquals(8, MaxStretch.maxStretch(list));
        list = Arrays.asList(1, 8, 5, 1, 2, 3, 4, 5, 10, 5, 5);
        assertEquals(9, MaxStretch.maxStretch(list));
    }
	
    @Test
    public void testSingleOverlapMaxStretch() {
        List<Integer> list = Arrays.asList(2, 7, 1, 2, 3, 7);
        assertEquals(5, MaxStretch.maxStretch(list));
    }
    
	// add more test cases
	
	
	
}