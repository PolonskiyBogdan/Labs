package sorters;

import java.util.Arrays;

@AnotSorterClass (name ="MergeSorterBubbleEnd")
public class MergeSorterBubbleEnd extends MergeSorter {
    private BubbleSortEnd bEnd = new BubbleSortEnd();

    @Override
    public int[] sorter(int arr[]) {
        if (arr.length < 2) {
            return arr;
        }
        int middle = arr.length / 2;

        merge(bEnd.sorter(Arrays.copyOfRange(arr, 0, middle)),
                bEnd.sorter(Arrays.copyOfRange(arr, middle, arr.length)));

        return arr;

    }
}
