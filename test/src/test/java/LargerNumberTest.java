import Exception.LargerNumber.LargerNumberException;
import org.junit.Test;

import static org.junit.Assert.*;

public class LargerNumberTest {
    @Test
    public void shouldAnException() {
        LargerNumber largerNumber = new LargerNumber(3);
        int[] array = new int[]{1, 2};
        try {
            largerNumber.getLargestNumbers(array);
            fail();
        } catch (LargerNumberException ex) {}
    }

    @Test
    public void getLargestNumbersTest() throws LargerNumberException {
        LargerNumber largerNumber = new LargerNumber(4);
        int[] array1 = new int[]{1, 4, 6, 7, 7, 3, 2};
        int[] array2 = new int[]{5, 7, 4, 6, 8, 9, 1, 3};
        int[] array3 = new int[]{3, 9, 5, 0};
        assertArrayEquals(new int[]{4, 6, 7, 7}, largerNumber.getLargestNumbers(array1));
        assertArrayEquals(new int[]{6, 7, 8, 9}, largerNumber.getLargestNumbers(array2));
        assertArrayEquals(new int[]{0, 3, 5, 9}, largerNumber.getLargestNumbers(array3));
    }

    @Test
    public void getLargestNumbersSimpleTest() {
        LargerNumberSimple largerNumber = new LargerNumberSimple();
        int[] array1 = new int[]{1, 4, 6, 7, 7, 3, 2};
        int[] array2 = new int[]{5, 7, 4, 6, 8, 9, 1, 3};
        int[] array3 = new int[]{3, 9, 5, 0};
        assertArrayEquals(new int[]{6, 7, 7}, largerNumber.getLargestNumbers(array1));
        assertArrayEquals(new int[]{7, 8, 9}, largerNumber.getLargestNumbers(array2));
        assertArrayEquals(new int[]{3, 5, 9}, largerNumber.getLargestNumbers(array3));
    }
}
