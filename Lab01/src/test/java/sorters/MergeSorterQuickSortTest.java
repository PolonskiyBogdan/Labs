package sorters;

import org.junit.Assert;
import org.junit.Test;

import static fillers.Fillers.*;
import static org.junit.Assert.*;

public class MergeSorterQuickSortTest {
    private MergeSorterQuickSort mergeSorterQuickSort = new MergeSorterQuickSort();
    @Test(timeout = 1000)
    public void sorter() {
        mergeSorterQuickSort.sorter(getRandomlyGeneratedArray());
        mergeSorterQuickSort.sorter(getArraySortedMaximumToMinimum());
        mergeSorterQuickSort.sorter(getArraySortedMinimumToMaximum());
        mergeSorterQuickSort.sorter(getArraySortedMinimumMaximumPlusRandNum());
    }
    public void sorter_Exeption() {
    }
}