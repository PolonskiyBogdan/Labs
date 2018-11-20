package fillers;

public abstract class ArrPrinter {
    public static void arrPr(int arr[]) {
        System.out.print("arr = [");
        for (int v : arr) {
            System.out.print(" " + v + " ");
        }
        System.out.println("]");

    }

}
