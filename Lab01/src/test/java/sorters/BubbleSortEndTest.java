package sorters;

import org.junit.Test;

import static fillers.Fillers.*;
import static org.junit.Assert.*;

public class BubbleSortEndTest {
    private BubbleSortEnd bubbleSortEnd = new BubbleSortEnd();
    @Test(timeout = 1000)
    public void sorter() {
        bubbleSortEnd.sorter(getRandomlyGeneratedArray());
        bubbleSortEnd.sorter(getArraySortedMaximumToMinimum());
        bubbleSortEnd.sorter(getArraySortedMinimumToMaximum());
        bubbleSortEnd.sorter(getArraySortedMinimumMaximumPlusRandNum());
    }
}