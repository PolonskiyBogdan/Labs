package sorters;

import java.util.Arrays;
/**
 * @author Polonskiy
 * @version 1.2
 *
 * Here is used Bubble sorting algorithm that works by repeatedly swapping the adjacent elements
 * if they are in wrong order.
 * Sorting starts from the begin of array
 */
public class BubSrtSta extends BubbleSorter {
    /**
     * has called methods showRes(arr), swapper(arr) from {@link BubbleSorter}
     * @param arr is an array, get from {@link fillers.Fillers} and set in Analyzer
     * @return int arr[]
     */
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
