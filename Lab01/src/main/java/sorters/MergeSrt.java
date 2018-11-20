package sorters;

//import fillers.ArrPrinter;

import java.util.Arrays;

public class MergeSrt implements ObjSavForM {
    public int[] mergeArrSrt (int arr[]) {
        int[] L = Arrays.copyOf(arr, arr.length / 2);
        int[] R = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        arS.srtArr(L);
        arS.srtArr(R);

        int[] narr = new int[L.length + R.length];

        System.arraycopy(L, 0, narr, 0, L.length);
        System.arraycopy(R, 0, narr, L.length, R.length);
        arS.srtArr(narr);

        return narr;
    }

    public int[] mergeBubbleSrtFrSt(int arr[]) {
        int[] L = Arrays.copyOf(arr, arr.length / 2);
        int[] R = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
        bSta.srtBubSta(L);
        bSta.srtBubSta(R);

        int[] narr = new int[L.length + R.length];

        System.arraycopy(L, 0, narr, 0, L.length);
        System.arraycopy(R, 0, narr, L.length, R.length);
        bSta.srtBubSta(narr);

        return narr;
    }

    public int[] mergeBubbleSrtFrEnd(int arr[]) {
        int[] L = Arrays.copyOf(arr, arr.length / 2);
        int[] R = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        bEnd.srtBubEnd(L);
        bEnd.srtBubEnd(R);

        int[] narr = new int[L.length + R.length];

        System.arraycopy(L, 0, narr, 0, L.length);
        System.arraycopy(R, 0, narr, L.length, R.length);
        bEnd.srtBubEnd(narr);

        return narr;
    }

    public int[] mergeQuickSrt(int arr[]) {
        int[] L = Arrays.copyOf(arr, arr.length / 2);
        int[] R = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        quSrt.srtQuick(L);
        quSrt.srtQuick(R);

        int[] narr = new int[L.length + R.length];

        System.arraycopy(L, 0, narr, 0, L.length);
        System.arraycopy(R, 0, narr, L.length, R.length);
        quSrt.srtQuick(narr);

        return narr;
    }
}
