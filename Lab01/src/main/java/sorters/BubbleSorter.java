package sorters;

import java.util.Arrays;
/**
 * Abstract Bubble Class which is a super class of <br>
 * @author Polonskiy
 * @version 1.2
 */
public abstract class BubbleSorter extends Sorter {

    public abstract int []  sorter (int[] arr);
    int i;
    int j;
    /**
     * In this method we swap the elements of given array <br>
     * @param arr is an array, set in <br>
     * @see BubbleSortStart#swapper(int[]) <br>
     * @see BubbleSortEnd#swapper(int[]) <br>
     */

    void swapper(int arr[]){
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

//    /**
//     * Method show the result of <br>
//     * @see BubbleSortStart
//     * @see BubbleSortEnd
//     * @param arr is an array, set in <br>
//     * @see BubbleSortStart#showRes(int[])
//     * @see BubbleSortEnd#showRes(int[])
//     */
//    void showRes(int arr[]){
//            System.out.print(Arrays.toString(arr) + " ");
//            System.out.println("i =" + i + " j =" + j);
//        }
}
