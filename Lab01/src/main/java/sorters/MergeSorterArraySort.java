package sorters;

import java.util.Arrays;

@AnotSorterClass (name ="MergeSorterArraySort")
public class MergeSorterArraySort extends MergeSorter {
    private ArraySort arS = new ArraySort();
    @Override
    public int[] sorter(int arr[]) {
        if (arr.length < 2){
            return arr;
        }
        int middle = arr.length / 2;

        merge (arS.sorter(Arrays.copyOfRange(arr,0,middle)),
                arS.sorter(Arrays.copyOfRange(arr,middle,arr.length)));
        return arr;

    }
}
