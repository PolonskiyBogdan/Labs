package sorters;

import java.util.Arrays;

@AnotSorterClass (name ="MergeSorterBubbleEnd")
public class MergeSorterBubbleEnd extends Sorter {
    private BubbleSortEnd bEnd = new BubbleSortEnd();

    public int[] sorter(int arr[]) {

//        if (arr.length < 2){
//            return arr;
//        }
//        int middle = arr.length / 2;
//
//        merge (arS.sorter(Arrays.copyOfRange(arr,0,middle)),
//                arS.sorter(Arrays.copyOfRange(arr,middle,arr.length)));
//        return arr;
        return splitter(arr);
    }


    public int[] splitter(int[] array) {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int numberOfThreads = availableProcessors < 2 ? 2 : availableProcessors;
        int[][] spittedArrays = splitArray(numberOfThreads, array);
        treadSort(numberOfThreads, spittedArrays);
        treadMerge(spittedArrays, array);
        return array;
    }
    private int[][] splitArray(int numberOfThreads, int[] array) {
        final int[][] spittedArrays = new int[numberOfThreads][];

        int len = array.length / numberOfThreads;
        for (int i = 0; i < numberOfThreads; i++) {
            spittedArrays[i] = new int[len];
            if (i == numberOfThreads - 1 && array.length % numberOfThreads != 0) {
                spittedArrays[i] = new int[array.length - len * i];
            }
            System.arraycopy(array, i * len, spittedArrays[i], 0, spittedArrays[i].length);
        }
        return spittedArrays;
    }
    private void treadSort(int numberOfThreads, int[][] spittedArrays) {
        Thread[] threads = new Thread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            int[] temp = spittedArrays[i];
            threads[i] = new Thread(() -> bEnd.sorter(temp));
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
                threads[i] = null; // Help GC
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void treadMerge(int[][] arrays, int[] resultArray) {
        int[] temp;
        int resultNumberOfArrays;
        for (int arrayLen = arrays.length / 2; arrayLen > 1; arrayLen /= 2) {
            resultNumberOfArrays = -1;
            for (int i = 0; i < arrayLen + 1; i += 2) {
                temp = new int[arrays[i].length + arrays[i + 1].length];
                merge(temp, arrays[i]);
                arrays[i] = null;
                arrays[i + 1] = null;
                arrays[++resultNumberOfArrays] = temp;
            }
        }
    }


    void merge(int[] part1, int[] part2) {
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
//       System.out.println(Arrays.toString(result) + " ");
    }
}

