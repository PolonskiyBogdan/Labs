import static ReflectionAnalyzer.ReflectionAnalyzer.refFill;
import static ReflectionAnalyzer.ReflectionAnalyzer.refSort;

/**
 *  Main is a class where Analyze methods are summoned <br>
 * @author Polonskiy
 * @version 1.2
 */

public class Main {
    //ToDo: rebuild fillers чтоб не зависели друг от друга
    //ToDo: переделать Sorter
    //ToDo: переиминовать методы в более длинные
    //ToDo: перелпределить методы под сортер
    //ToDo: избавиться от private static int arrGR[] = new int[6]; в филлерах
    //ToDo: ДОДЕЛАТЬ ReflectionAnalyzer !!!!!!!!
    //Todo: каждий массив генериться отдельн????
    //ToDo:

    /**
     * Main Method used for summoning Analyze methods <br>
     * @param args command line values
     */
    public static void main(String[] args) {
//        arrGenR();
//        arrMaMi();
//        arrMiMa();
//        arrMiMaRX();
        refFill();
        refSort();
    }
}
