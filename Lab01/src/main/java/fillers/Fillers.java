package fillers;
import java.util.Arrays;
import java.util.Random;
/**
 *  Class where Fillers are generated
 * @author Polonskiy
 * @version 1.2
 */
public class Fillers {
    private static Random random = new Random();
    /**
     *  generates unsorted Array
     */
    private static int [] arrayGeneator(){
        //        int arrGR[] = { 5,1,4,2,8,0,2 };
        int[] generatedArray = new int[30];
        for (int i = 0; i < generatedArray.length; i++) {
            generatedArray[i] = random.nextInt(10);
        }
        return  generatedArray;
    }
    /**
     * @return Randomly Generated Array which is used in other fillers as generated array
     * {@code
     * public static int[] getRandomlyGeneratedArray() {
     *         Random random = new Random();
     *         for (int i = 0; i < arrGR.length; i++) {
     *             arrGR[i] = random.nextInt(10);
     *         }
     *         System.out.println(Arrays.toString(arrGR) + " ");
     *         return arrGR;
     *     }}
     */
    @SpecialAnnotation(name = "Random Array")
    public static int[] getRandomlyGeneratedArray() {
//        System.out.println(Arrays.toString(arrGR) + " ");
        return arrayGeneator();
    }

    /**
     * @return array sorted from Maximum to Minimum
     * {@code
     * <code>public static int[] getArraySortedMaximumToMinimum() {
     *
     *         int[] arr = arrGR;
     *         for (int i = 0; i < arr.length - 1; i++) {
     *             for (int j = 0; j < arr.length - i - 1; j++) {
     *                 if (arr[j] < arr[j + 1]) {
     *                     int temp = arr[j];
     *                     arr[j] = arr[j + 1];
     *                     arr[j + 1] = temp;
     *                 }
     *             }
     *         }
     *         System.out.println(Arrays.toString(arr) + " ");
     *         return arr;
     *     }}
     */
    @SpecialAnnotation(name = "from Maximum to Minimum")
    public static int[] getArraySortedMaximumToMinimum() {

        int[] arr = arrayGeneator();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
//        System.out.println(Arrays.toString(arr) + " ");
        return arr;
    }
    /**
     * @return array sorted from Minimum to Maximum
     * {@code
     *  public static int[] getArraySortedMinimumToMaximum() {
     *         int[] arr = arrGR;
     *         Arrays.sort(arr);
     *         System.out.println(Arrays.toString(arr) + " ");
     *         return arr;
     *     }}
     */
    @SpecialAnnotation(name = "from Minimum to Maximum")
    public static int[] getArraySortedMinimumToMaximum() {
        int[] arr = arrayGeneator();
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr) + " ");
        return arr;
    }
    /**
     * @return array sorted from Maximum to Minimum + Random number
     * {@code
     * public static int[] getArraySortedMinimumMaximumPlusRandNum() {
     *         int[] arr = arrGR;
     *         int[] narr = Arrays.copyOf(arr, arr.length + 1);
     *         Random random = new Random();
     *         narr[narr.length - 1] = random.nextInt(30);
     *         Arrays.sort(narr);
     *         System.out.println(Arrays.toString(narr) + " ");
     *         return narr;
     *     }}
     */
    @SpecialAnnotation(name = "from Maximum to Minimum + Random number")
    public static int[] getArraySortedMinimumMaximumPlusRandNum() {
        int[] arr = arrayGeneator();
        int[] narr = Arrays.copyOf(arr, arr.length + 1);
        Random random = new Random();
        narr[narr.length - 1] = random.nextInt(30);
        Arrays.sort(narr);
//        System.out.println(Arrays.toString(narr) + " ");
        return narr;
    }

}
