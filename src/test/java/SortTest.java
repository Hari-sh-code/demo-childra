import org.junit.Test;
import static org.junit.Assert.*;

public class SortTest {
    @Test
    public void testSelectionSort() {
        int[] input = {5, 3, 8, 1, 2};
        int[] expected = {1, 2, 3, 5, 8};
        Sort.selectionSort(input);
        assertArrayEquals(expected, input);
    }
}
