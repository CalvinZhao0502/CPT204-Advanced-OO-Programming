import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OddAndTenTest {

    @Test
    public void test1() {
        List<Integer> list = Arrays.asList(5, 5, 4, 1 );
        assertEquals(true, OddAndTen.oddAndTen(list));
    }
    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(5, 5, 4);
        assertEquals(false,  OddAndTen.oddAndTen(list));
    }


}
