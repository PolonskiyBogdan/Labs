package sorters;

import fillers.ArrPrinter;
import java.util.Arrays;

public class BubSrtSta {

    public int[] srtBubSta(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                System.out.print(Arrays.toString(arr) + " ");
                System.out.println("j =" + j + " i =" + i);

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        ArrPrinter.arrPr(arr);
        return arr;

    }
}
