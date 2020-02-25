package algorithms.sortingAlgorithms;
import org.junit.Assert;
import org.junit.Test;

import co.uk.simeonlees.algorithms.QuickSort;

public class QuickSortTest {
  @Test
  public void itSortsAnArray() {
    QuickSort quickSort = new QuickSort();
    int[] unsorted = new int[]{1,4,2,0,20};
    int[] sorted = new int[]{0,1,2,4,20};
    int[] result = quickSort.sort(unsorted);
    Assert.assertArrayEquals(sorted, result);
  }
}
