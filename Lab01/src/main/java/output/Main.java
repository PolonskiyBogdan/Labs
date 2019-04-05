package output;

import ReflectionAnalyzer.ReflectionAnalyzer;
import ReflectionAnalyzer.ReflectionMethodsNames;
import excel.Datatime;
import excel.ExcelCreator;
import excel.RowsNames;
import excel.SheetName;
import fillers.Fillers;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import sorters.MergeSorterArraySort;

import java.io.IOException;

import  static  fillers.Fillers.*;

/**
 *  output.Main is a class where Analyze methods are summoned <br>
 * @author Polonskiy
 * @version 1.2
 */

public class Main {
     /**
     * output.Main Method used for summoning Analyze methods <br>
     * @param args command line values
     */
    public static void main(String[] args) throws IOException, InvalidFormatException {

        ReflectionAnalyzer reflectionAnalyzer = new ReflectionAnalyzer();
        ExcelCreator excelCreator = new ExcelCreator();
        RowsNames rowsNames = new RowsNames();
        SheetName sheetName = new SheetName();
        Datatime datatime = new Datatime();
        Fillers fillers =new Fillers();
        MergeSorterArraySort mergeSorterArraySort = new MergeSorterArraySort();
        for (int i = 0; i < 1; i++) {
            reflectionAnalyzer.analyzer();

//            System.out.println(excelCreator.columns);
//            System.out.println(excelCreator.sheetname);

            System.out.println("N = " + getN());
            setN(10 + getN());
        }
        excelCreator.creatorOFExcel("Result.xls",sheetName.getSheetname(),rowsNames.getRows(),datatime.getTime());
    }
}

