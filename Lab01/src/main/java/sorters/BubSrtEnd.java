package sorters;

import fillers.ArrPrinter;
import java.util.Arrays;

public class BubSrtEnd {
    public int[] srtBubEnd(int arr[]) {
        int temp;
        int l =0;
        int r = arr.length -1;
        for (int i = r; i > l; i--) {
            for (int j = l; j < r; j++) {
                System.out.print(Arrays.toString(arr) + " ");
                System.out.println("j =" + j + " i =" + i);

                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        ArrPrinter.arrPr(arr);
        return arr;
    }
}
