import java.util.Arrays;

public class LargerNumberSimple {
    public int[] getLargestNumbers (int[] array) {
        int[] largestNumbers = new int[3];
        int index = 0;
        Arrays.sort(array);
        for (int i = array.length - 3; i < array.length; i++) {
            largestNumbers[index] = array[i];
        }
        return largestNumbers;
    }
}
