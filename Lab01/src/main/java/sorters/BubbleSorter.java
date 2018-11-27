package sorters;

import java.util.Arrays;
/**
 * @author Polonskiy
 * @version 1.2
 * It is a super class of
 * @see BubSrtEnd,BubSrtSta
 * and its super class is
 * @see Sorter
 */
public class BubbleSorter extends Sorter {

     int i;
     int j;

    /**
     * In this method we swap the elements of given array
     * @param arr is an array, set in
     * @see BubSrtSta#swapper(int[])
     * @see BubSrtEnd#swapper(int[])
     */
    void swapper(int arr[]){
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

    /**
     * Method show the result of
     * @see BubSrtSta
     * @see BubSrtEnd
     * @param arr is an array, set in
     * @see BubSrtSta#showRes(int[])
     * @see BubSrtEnd#showRes(int[])
     */
    void showRes(int arr[]){
            System.out.print(Arrays.toString(arr) + " ");
            System.out.println("i =" + i + " j =" + j);
        }
}
