package sorters;

import java.util.Arrays;

@AnotSorterClass (name ="MergeSorterBubbleStart")
public class MergeSorterBubbleStart extends MergeSorter{
    private BubbleSortStart bSta = new BubbleSortStart();
    @Override
    public int[] sorter(int arr[]) {
        if (arr.length < 2) {
            return arr;
        }
        int middle = arr.length / 2;


        merge(bSta.sorter(Arrays.copyOfRange(arr, 0, middle)),
                bSta.sorter(Arrays.copyOfRange(arr, middle, arr.length)));

        return arr;

    }
}
