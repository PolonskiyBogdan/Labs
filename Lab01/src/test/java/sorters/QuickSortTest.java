package sorters;

import org.junit.Test;

import static fillers.Fillers.*;
import static org.junit.Assert.*;

public class QuickSortTest {
   private QuickSort quickSort = new QuickSort();
    @Test(timeout = 1000)
    public void sorter() {
        quickSort.sorter(getRandomlyGeneratedArray());
        quickSort.sorter(getArraySortedMaximumToMinimum());
        quickSort.sorter(getArraySortedMinimumToMaximum());
        quickSort.sorter(getArraySortedMinimumMaximumPlusRandNum());
    }
}