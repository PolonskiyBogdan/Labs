package sorters;

import org.junit.Assert;
import static fillers.Fillers.*;
import org.junit.Test;


public class ArraySortTest {
    private ArraySort arraySort = new ArraySort();
    @Test(timeout = 100)
    public void sorter() {
        arraySort.sorter(getRandomlyGeneratedArray());
        arraySort.sorter(getArraySortedMaximumToMinimum());
        arraySort.sorter(getArraySortedMinimumToMaximum());
        arraySort.sorter(getArraySortedMinimumMaximumPlusRandNum());
    }
}