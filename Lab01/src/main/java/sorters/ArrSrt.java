package sorters;


import java.util.Arrays;

public class ArrSrt extends Sorter {
    public int[] srtArr(int arr[]) {
        Arrays.sort(arr);

        System.out.print(Arrays.toString(arr) + " ");
        return arr;
    }
}
