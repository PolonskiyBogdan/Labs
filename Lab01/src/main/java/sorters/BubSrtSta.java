package sorters;

import java.util.Arrays;

public class BubSrtSta extends BubbleSorter {
    public int[] srtBubSta(int arr[]) {
        for ( i = 0; i < arr.length - 1; i++) {
            for ( j = 0; j < arr.length  - 1; j++) {
                showRes(arr);
                swapper(arr);
            }
        }
        System.out.print(Arrays.toString(arr) + " ");
        return arr;

    }
}
