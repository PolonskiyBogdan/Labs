package sorters;

import org.junit.Test;

import static fillers.Fillers.*;
import static org.junit.Assert.*;

public class MergeSorterBubbleStartTest {
    private MergeSorterBubbleStart mergeSorterBubbleStart = new MergeSorterBubbleStart();
    @Test(timeout = 1000)
    public void sorter() {
        mergeSorterBubbleStart.sorter(getRandomlyGeneratedArray());
        mergeSorterBubbleStart.sorter(getArraySortedMaximumToMinimum());
        mergeSorterBubbleStart.sorter(getArraySortedMinimumToMaximum());
        mergeSorterBubbleStart.sorter(getArraySortedMinimumMaximumPlusRandNum());
    }
}