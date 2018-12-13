package sorters;

import java.util.Arrays;
/**
 * Here is used  Bubble sorting algorithm that works by repeatedly swapping the adjacent elements <br>
 * if they are in wrong order. <br>
 * Sorting starts from the end of array <br>
 * @author Polonskiy
 * @version 1.2

 */
@AnotSorterClass (name ="BubbleSortEnd")
public class BubbleSortEnd extends BubbleSorter {
    /**
     * has called methods showRes(arr), swapper(arr) from {@link BubbleSorter} <br>
     * @param arr is an array, get from {@link fillers.Fillers} and set in analyzer
     * @return int arr[]
     */
    @Override

    public int[] sorter(int arr[]) {
        for ( i = 0; i < arr.length - 1; i++) {
            for ( j = arr.length - 2; j >= 0; j--) {

//                showRes(arr);
                swapper(arr);
            }
        }
//        System.out.println("Buble end");

//        System.out.println(Arrays.toString(arr) + " ");
        return arr;
    }
}
