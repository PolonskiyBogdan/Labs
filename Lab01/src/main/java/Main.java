import ReflectionAnalyzer.ReflectionAnalyzer;
import excel.ExcelCreator;

import  static  fillers.Fillers.*;

/**
 *  Main is a class where Analyze methods are summoned <br>
 * @author Polonskiy
 * @version 1.2
 */

public class Main {
     /**
     * Main Method used for summoning Analyze methods <br>
     * @param args command line values
     */
    public static void main(String[] args) {

        ReflectionAnalyzer reflectionAnalyzer = new ReflectionAnalyzer();
        ExcelCreator excelCreator = new ExcelCreator();
        System.out.println(excelCreator.columns);
        for (int i = 0; i < 1; i++) {
            reflectionAnalyzer.analyzer();
            System.out.println("N = " + getN());
            setN(100 + getN());
        }
    }
}

