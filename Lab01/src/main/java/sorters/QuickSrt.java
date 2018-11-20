package sorters;

import fillers.ArrPrinter;
import java.util.Random;

public class QuickSrt {
    public int[] srtQuick(int arr[]) {
        qSort(arr, 0, arr.length-1);

        ArrPrinter.arrPr(arr);
        return arr;
    }

    private void qSort(int[] arr, int low, int high) {
        if (low < high + 1) {
            int p = partition(arr, low, high);
            qSort(arr, low, p - 1);
            qSort(arr, p + 1, high);
        }
    }

    private void swap(int[] arr, int id1, int id2) {
        int temp = arr[id1];
        arr[id1] = arr[id2];
        arr[id2] = temp;
    }

    private int getPivot(int low, int high) {
        Random rand = new Random();
        return rand.nextInt((high - low) + 1) + low;
    }

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
