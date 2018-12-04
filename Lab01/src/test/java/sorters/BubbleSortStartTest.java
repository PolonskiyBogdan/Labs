package sorters;

import org.junit.Test;

import static fillers.Fillers.*;
import static org.junit.Assert.*;

public class BubbleSortStartTest {
    private BubbleSortStart bubbleSortStart = new BubbleSortStart();
    @Test(timeout = 1000)
    public void sorter() {
        bubbleSortStart.sorter(getRandomlyGeneratedArray());
        bubbleSortStart.sorter(getArraySortedMaximumToMinimum());
        bubbleSortStart.sorter(getArraySortedMinimumToMaximum());
        bubbleSortStart.sorter(getArraySortedMinimumMaximumPlusRandNum());
    }
}