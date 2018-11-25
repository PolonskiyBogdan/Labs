package sorters;

import java.util.Arrays;

public class BubbleSorter extends Sorter {
     int i;
     int j;
         void swapper(int arr[]){
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
         void showRes(int arr[]){
            System.out.print(Arrays.toString(arr) + " ");
            System.out.println("i =" + i + " j =" + j);
        }
}
