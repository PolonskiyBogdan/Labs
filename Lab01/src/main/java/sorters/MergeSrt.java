package sorters;

import java.util.Arrays;

/**
 *  Main is a class where Analyze methods are summoned <br>
 * @author Polonskiy
 * @version 1.2
 */
public class MergeSrt extends Sorter {

   private ArrSrt arS = new ArrSrt();
   private BubSrtSta bSta = new BubSrtSta();
   private BubSrtEnd bEnd = new BubSrtEnd();
   private QuickSrt quSrt = new QuickSrt();

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
    int[] merge (int[] part1, int[] part2){
        int len_1 = part1.length, len_2 = part2.length;
        int a = 0, b = 0, len = len_1 + len_2; // a, b - счетчики в массивах
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            if (b < len_2 && a < len_1) {
                if (part1[a] > part2[b]) result[i] = part2[b++];
                else result[i] = part1[a++];
            } else if (b < len_2) {
                result[i] = part2[b++];
            } else {
                result[i] = part1[a++];
            }
        }
        System.out.println(Arrays.toString(result) + " ");
        return result;
    }

}
