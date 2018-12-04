package sorters;

import org.junit.Test;

import static fillers.Fillers.*;
import static org.junit.Assert.*;

public class MergeSorterArraySortTest {
    private MergeSorterArraySort mergeSorterArraySort = new MergeSorterArraySort();
    @Test(timeout = 1000)
    public void sorter() {
        mergeSorterArraySort.sorter(getRandomlyGeneratedArray());
        mergeSorterArraySort.sorter(getArraySortedMaximumToMinimum());
        mergeSorterArraySort.sorter(getArraySortedMinimumToMaximum());
        mergeSorterArraySort.sorter(getArraySortedMinimumMaximumPlusRandNum());
    }
}