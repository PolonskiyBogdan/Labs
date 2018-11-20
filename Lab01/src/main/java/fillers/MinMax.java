package fillers;



import java.util.Arrays;

public class MinMax extends ArrGR {

    public int[] arrMiMa()  {

       int[] arr = arrGenR();
        Arrays.sort(arr);
        arrPr(arr);
        return arr;
    }
}
