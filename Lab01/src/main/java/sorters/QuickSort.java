package sorters;

//import java.util.Arrays;
import java.util.Random;
/**
 * Here is used QuickSort which is a Divide and Conquer algorithm. <br>
 * It picks an element as pivot and partitions the given array around the picked pivot. <br>
 * Here is used picking a random element as pivot. <br>
 * The key process in quickSort is {@link #partition(int[], int, int)}. <br>
 * @author Polonskiy
 * @version 1.2
 */
public class QuickSort extends Sorter {
    /**
     * this method set arr, low and high and return sorted array <br>
     * @param arr is an array, get from {@link fillers.Fillers} and set in Analyzer
     * @return int arr[]
     */
    @Override
    public int[] sorter(int arr[]) {
        qSort(arr, 0, arr.length-1);

//        System.out.println("Quick sort");

//        System.out.println(Arrays.toString(arr) + " ");
        return arr;
    }

    /**
     *
     * @param arr set in {@link #sorter(int[])}
     * @param low set in {@link #sorter(int[])}
     * @param high set in {@link #sorter(int[])}
     */
    private void qSort(int[] arr, int low, int high) {
        if (low < high + 1) {
            int p = partition(arr, low, high);
            qSort(arr, low, p - 1);
            qSort(arr, p + 1, high);
        }
    }

    /**
     * this method swap different elements of array <br>
     * @param arr set in {@link #sorter(int[])}
     * @param id1 set in {@link #qSort(int[], int, int)}
     * @param id2 set in {@link #qSort(int[], int, int)}
     */
    private void swap(int[] arr, int id1, int id2) {
        int temp = arr[id1];
        arr[id1] = arr[id2];
        arr[id2] = temp;
    }

    /**
     * Sets random pivot <br>
     * @param low set in {@link #sorter(int[])}
     * @param high set in {@link #sorter(int[])}
     * @return int low, int high
     */
    private int getPivot(int low, int high) {
        Random rand = new Random();
        return rand.nextInt((high - low) + 1) + low;
    }
    /**
     * this method is, given an array and an element x of array as pivot. <br>
     * @param arr set in {@link #sorter(int[])}
     * @param low set in {@link #sorter(int[])}
     * @param high set in {@link #sorter(int[])}
     * @return border
     */
    private int partition(int[] arr, int low, int high) {
        swap(arr, low, getPivot(low, high));
        int border = low + 1;
        for (int i = border; i <= high; i++) {
            if (arr[i] < arr[low]) {
                swap(arr, i, border++);
            }
        }
        swap(arr, low, border - 1);
        return border - 1;
    }

}
