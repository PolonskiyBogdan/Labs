package sorters;

import java.util.Arrays;


public class MergeSrt extends Merge  {


    public int[] meArrSrt(int arr[]) {
        if (arr.length < 2){
            return arr;
        }
        int middle = arr.length / 2;

        return merge (arS.srtArr(Arrays.copyOfRange(arr,0,middle)),
                arS.srtArr(Arrays.copyOfRange(arr,middle,arr.length)));

    }
    public int[] meBubSta(int arr[]) {
        if (arr.length < 2){
            return arr;
        }
        int middle = arr.length / 2;

        return merge (bSta.srtBubSta(Arrays.copyOfRange(arr,0,middle)),
                bSta.srtBubSta(Arrays.copyOfRange(arr,middle,arr.length)));
    }

    public int[] meBubEnd(int arr[]) {
        if (arr.length < 2){
            return arr;
        }
        int middle = arr.length / 2;

        return merge (bEnd.srtBubEnd(Arrays.copyOfRange(arr,0,middle)),
                bEnd.srtBubEnd(Arrays.copyOfRange(arr,middle,arr.length)));
    }

    public int[] meQuick(int arr[]) {
        if (arr.length < 2){
            return arr;
        }
        int middle = arr.length / 2;

        return merge (quSrt.srtQuick(Arrays.copyOfRange(arr,0,middle)),
                quSrt.srtQuick(Arrays.copyOfRange(arr,middle,arr.length)));
    }


}
