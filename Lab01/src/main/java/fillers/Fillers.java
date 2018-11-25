package fillers;

import java.util.Arrays;
import java.util.Random;

public class Fillers {

    public static int[] arrGenR() {
//        int arrGR[] = { 5,1,4,2,8,0,2 };
        int[] arrGR = new int[6];
        Random random = new Random();
        for (int i = 0; i < arrGR.length; i++) {
            arrGR[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arrGR) + " ");
        return arrGR;
    }

    public static int[] arrMaMi() {

        int[] arr = arrGenR();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr) + " ");
        return arr;
    }

    public static int[] arrMiMa()  {
        int[] arr = arrGenR();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr) + " ");
        return arr;
    }

    public static int[] arrMiMaRX() {
        int[] arr = arrGenR();
        int[] narr = Arrays.copyOf(arr, arr.length + 1);
        Random random = new Random();
        narr[narr.length - 1] = random.nextInt(30);
        Arrays.sort(narr);
        System.out.println(Arrays.toString(narr) + " ");
        return narr;
    }

}
