package sorters;

import fillers.ArrPrinter;
import java.util.Arrays;

public class BubSrtEnd {
    public int[] srtBubEnd(int arr[]) {
        int temp;
        int l =0;
        int r = arr.length -1;
        for (int i = r; i > l; i--) {
            System.out.print(Arrays.toString(arr) + " ");
            System.out.println(" i =" + i);

            if (arr[i - 1] > arr[i]) {
                temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
        for (int j = l; j < r; j++) {
            System.out.print(Arrays.toString(arr) + " ");
            System.out.println("j =" + j );
            if (arr[j] > arr[j+1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        ArrPrinter.arrPr(arr);
        return arr;
    }
}
