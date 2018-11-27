package sorters;

import java.util.Arrays;
/**
 * Abstract Bubble Class which is a super class of <br>
 * @author Polonskiy
 * @version 1.2
 */
public class BubbleSorter extends Sorter {

     int i;
     int j;

    /**
     * In this method we swap the elements of given array <br>
     * @param arr is an array, set in <br>
     * @see BubSrtSta#swapper(int[]) <br>
     * @see BubSrtEnd#swapper(int[]) <br>
     */
    void swapper(int arr[]){
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

    /**
     * Method show the result of <br>
     * @see BubSrtSta
     * @see BubSrtEnd
     * @param arr is an array, set in <br>
     * @see BubSrtSta#showRes(int[])
     * @see BubSrtEnd#showRes(int[])
     */
    void showRes(int arr[]){
            System.out.print(Arrays.toString(arr) + " ");
            System.out.println("i =" + i + " j =" + j);
        }
}
