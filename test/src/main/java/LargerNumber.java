import Exception.LargerNumber.LargerNumberErrorCode;
import Exception.LargerNumber.LargerNumberException;

import java.util.Arrays;

public class LargerNumber {
    private final int RETURN_NUMBER_COUNT;

    public LargerNumber(int RETURN_NUMBER_COUNT) {
        this.RETURN_NUMBER_COUNT = RETURN_NUMBER_COUNT;
    }

    public int[] getLargestNumbers (int[] array) throws LargerNumberException {
        if(array.length < RETURN_NUMBER_COUNT) {
            throw new LargerNumberException(LargerNumberErrorCode.ARRAY_IS_SHORT);
        }

        int[] largestNumbers = new int[RETURN_NUMBER_COUNT];
        int index = 0;

        Arrays.sort(array);

        for (int i = array.length - RETURN_NUMBER_COUNT; i < array.length; i++) {
            largestNumbers[index] = array[i];
            index++;
        }
        return largestNumbers;
    }
}
