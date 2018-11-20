package fillers;

import java.util.Arrays;
import java.util.Random;

public class MinMaxRX extends ArrGR {
    public int[] arrMiMaRX() {
        int[] arr = arrGenR();
        int[] narr = Arrays.copyOf(arr, arr.length + 1);
        Random random = new Random();
        narr[narr.length - 1] = random.nextInt(30);
        Arrays.sort(narr);
        arrPr(narr);
        return narr;
    }
}