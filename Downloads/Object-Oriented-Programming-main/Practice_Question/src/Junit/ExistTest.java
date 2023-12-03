import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ExistTest {
    private int high;
    private int elementToBeFound;
    private int[] arr;

    BinarySearch bin;

    @Test
    public void testExist() {
        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array
        elementToBeFound = 5; // Element to be found
        bin = new BinarySearch(arr, elementToBeFound);
        assertEquals(1, bin.binarySearch());
    }

    @Test
    public void testExist1() {
        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 100}; // Example array
        elementToBeFound = 5; // Element to be found
        bin = new BinarySearch(arr, elementToBeFound);
        assertEquals(1, bin.binarySearch());
    }
}