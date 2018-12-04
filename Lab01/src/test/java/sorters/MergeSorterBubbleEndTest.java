package sorters;

import org.junit.Test;

import static fillers.Fillers.*;
import static org.junit.Assert.*;

public class MergeSorterBubbleEndTest {
    private MergeSorterBubbleEnd mergeSorterBubbleEnd = new MergeSorterBubbleEnd();
    @Test(timeout = 1000)
    public void sorter() {
        mergeSorterBubbleEnd.sorter(getRandomlyGeneratedArray());
        mergeSorterBubbleEnd.sorter(getArraySortedMaximumToMinimum());
        mergeSorterBubbleEnd.sorter(getArraySortedMinimumToMaximum());
        mergeSorterBubbleEnd.sorter(getArraySortedMinimumMaximumPlusRandNum());
    }
}