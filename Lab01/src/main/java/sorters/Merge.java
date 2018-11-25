package sorters;

import java.util.Arrays;

public class Merge extends Sorter {
    ArrSrt arS = new ArrSrt();
    BubSrtSta bSta = new BubSrtSta();
    BubSrtEnd bEnd = new BubSrtEnd();
    QuickSrt quSrt = new QuickSrt();


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
