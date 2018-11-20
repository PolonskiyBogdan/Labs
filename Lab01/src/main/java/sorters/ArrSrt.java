package sorters;

import fillers.ArrPrinter;
import java.util.Arrays;

public class ArrSrt {
    public int[] srtArr(int arr[]) {
        Arrays.sort(arr);

        ArrPrinter.arrPr(arr);
        return arr;
    }
}
