package excel;

import ReflectionAnalyzer.ReflectionMethodsNames;

import java.util.List;

/**
 *  Class that create and write excel file
 * @author Polonskiy
 * @version 1.2
 */
public class ExcelCreator {
    private ReflectionMethodsNames reflectionMethodsNames = new ReflectionMethodsNames();
    public List<String> columns = reflectionMethodsNames.getRefFillName();



}
