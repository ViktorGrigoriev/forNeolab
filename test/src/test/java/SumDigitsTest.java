import org.junit.Test;
import static org.junit.Assert.*;

public class SumDigitsTest {
    @Test
    public void sumDigitsTest() {
        SumDigits sd = new SumDigits();
        assertEquals(4, sd.getSumDigits(4));
        assertEquals(5, sd.getSumDigits(23));
        assertEquals(18, sd.getSumDigits(567));
        assertEquals(22, sd.getSumDigits(4189));
        assertEquals(17, sd.getSumDigits(34082));
    }
}
