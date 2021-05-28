import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;


public class MatchSwapTest {
    @Test
    public void testCase1() {
        List<String> list = Arrays.asList("ap", "bp", "cp", "cq", "cd","cp");
        assertEquals(Arrays.asList("ap", "bp", "cq", "cp", "cp","cd"), MatchSwap.matchSwap(list));

    }
    @Test
    public void testCase2() {
        List<String> list = Arrays.asList("ab", "ac", "ad", "cd", "ae","am");
        assertEquals(Arrays.asList("ac", "ab", "ae", "cd", "ad","am"), MatchSwap.matchSwap(list));

    }
    @Test
    public void testCase3() {
        List<String> list = Arrays.asList("apple", "avocado");
        assertEquals(Arrays.asList("avocado", "apple"), MatchSwap.matchSwap(list));

    }
    
	
	
	
}