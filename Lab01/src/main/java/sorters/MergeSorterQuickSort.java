package sorters;

import java.util.Arrays;

public class MergeSorterQuickSort extends MergeSorter {
    private QuickSort quSrt = new QuickSort();

    @Override
    public int[] sorter(int arr[]) {
        if (arr.length < 2) {
            return arr;
        }
        int middle = arr.length / 2;

        merge(quSrt.sorter(Arrays.copyOfRange(arr, 0, middle)),
                quSrt.sorter(Arrays.copyOfRange(arr, middle, arr.length)));
        return arr;

    }
}
