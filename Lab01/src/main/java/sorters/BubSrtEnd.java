package sorters;

import java.util.Arrays;

public class BubSrtEnd extends BubbleSorter {
    public int[] srtBubEnd(int arr[]) {
        for ( i = 0; i < arr.length - 1; i++) {
            for ( j = arr.length - 2; j >= 0; j--) {
                showRes(arr);
                swapper(arr);
            }
        }
        System.out.print(Arrays.toString(arr) + " ");
        return arr;
    }
}
