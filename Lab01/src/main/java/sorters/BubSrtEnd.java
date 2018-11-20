package sorters;

import fillers.ArrPrinter;
import java.util.Arrays;

public class BubSrtEnd {
    public int[] srtBubEnd(int arr[]) {
        int temp;
        for (int i = arr.length -1; i > 0; i--) {
            for (int j = 0; j < arr.length -1; j++) {
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
