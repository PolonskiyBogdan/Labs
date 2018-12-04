package sorters;


import java.util.Arrays;
/**
 * Here generated arrays from {@link fillers.Fillers} are sorted by {@code Arrays.sort(arr)} <br>
 * @author Polonskiy
 * @version 1.2
 */
public class ArraySort extends Sorter {
    /**
     * @param arr is an array, get from {@link fillers.Fillers} and set in analyzer <br>
     * @return arr
     */
    @Override
    public int[] sorter (int arr[]) {
        Arrays.sort(arr);
//        System.out.println("Array sortt");
//        System.out.println(Arrays.toString(arr) + " ");
        return arr;
    }
}
