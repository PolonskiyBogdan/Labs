package fillers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Random;
/**
 *  Class where Fillers are generated
 * @author Polonskiy
 * @version 1.2
 */
public class Fillers {
    /**
     *  used to set an array values to another fillers without generating new array
     */
    private static int arrGR[] = new int[6];

    /**
     * Created annotation
     * used to mark Fillers methods for Reflection
     * has name and id as it parameters
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface SpecAnot {
        String name();
        int id() default 0;
    }

    /**
     * @return arrGR which is used in other fillers as generated array
     */
    @SpecAnot(name = "Random Array", id = 1)
    public static int[] arrGenR() {
//        int arrGR[] = { 5,1,4,2,8,0,2 };
        Random random = new Random();
        for (int i = 0; i < arrGR.length; i++) {
            arrGR[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arrGR) + " ");
        return arrGR;
    }

    /**
     * @return arr sorted from Maximum to Minimum
     */
    @SpecAnot(name = "from Maximum to Minimum", id = 2)
    public static int[] arrMaMi() {

        int[] arr = arrGR;
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
    /**
     * @return arr sorted from Minimum to Maximum
     */
    @SpecAnot(name = "from Minimum to Maximum", id = 3)
    public static int[] arrMiMa() {
        int[] arr = arrGR;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr) + " ");
        return arr;
    }
    /**
     * @return arr sorted from Maximum to Minimum + Random number
     */
    @SpecAnot(name = "from Maximum to Minimum + Random number", id = 4)
    public static int[] arrMiMaRX() {
        int[] arr = arrGR;
        int[] narr = Arrays.copyOf(arr, arr.length + 1);
        Random random = new Random();
        narr[narr.length - 1] = random.nextInt(30);
        Arrays.sort(narr);
        System.out.println(Arrays.toString(narr) + " ");
        return narr;
    }

}
