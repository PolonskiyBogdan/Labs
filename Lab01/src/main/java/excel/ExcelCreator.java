package excel;

import ReflectionAnalyzer.ReflectionAnalyzer;
import ReflectionAnalyzer.ReflectionMethodsNames;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.charts.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.charts.XSSFChartLegend;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

/**
 *  Class that create and write excel file
 * @author Polonskiy
 * @version 1.2
 */
public class ExcelCreator {
    private ReflectionMethodsNames reflectionMethodsNames = new ReflectionMethodsNames();
    private ReflectionAnalyzer reflectionAnalyzer = new ReflectionAnalyzer();

    public  void creatorOFExcel( String fileName,  List<String> sheetName,List<String> rowName,
                                 List<Long> data) throws IOException, InvalidFormatException{
        File file;
        OutputStream fos = null;
        XSSFWorkbook workbook = null;
        XSSFSheet sheet = workbook.createSheet(sheetName.toString());
        try {
            file = new File(fileName);
            if (file.exists()) {
                workbook = (XSSFWorkbook) WorkbookFactory.create(new FileInputStream(file));
            } else {
                workbook = new XSSFWorkbook();
            }

            rowName = getFieldNamesForClass(rowName.getClass());
            int rowCount = 0;
            int columnCount = 0;
            assert sheet != null;
            Row row = sheet.createRow(rowCount++);
            for (String fieldName : rowName) {
                Cell cell = row.createCell(columnCount++);
                cell.setCellValue(fieldName);
            }
            Class<? extends Object> classz = rowName.get(0).getClass();
            for (Long t : data) {
                row = sheet.createRow(rowCount++);
                columnCount = 0;
                for (String fieldName : rowName) {
                    Cell cell = row.createCell(columnCount);
                    Method method = null;
                    try {
                        method = classz.getMethod("get" + capitalize(fieldName));
                    } catch (NoSuchMethodException nme) {
                        method = classz.getMethod("get" + fieldName);
                    }
                    Object value = method.invoke(t, (Object[]) null);
                    if (value != null) {
                        if (value instanceof String) {
                            cell.setCellValue((String) value);
                        } else if (value instanceof Long) {
                            cell.setCellValue((Long) value);
                        } else if (value instanceof Integer) {
                            cell.setCellValue((Integer) value);
                        } else if (value instanceof Double) {
                            cell.setCellValue((Double) value);
                        }
                    }
                    columnCount++;
                }
            }
            fos = new FileOutputStream(file);
            workbook.write(fos);
            fos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
            }
            try {
                if (workbook != null) {
                    workbook.close();
                }
            } catch (IOException e) {
            }
        }
        XSSFDrawing xlsx_drawing = sheet.createDrawingPatriarch();

        XSSFClientAnchor anchor = xlsx_drawing.createAnchor(0, 0, 0, 0, 0, 5, 10, 15);

        XSSFChart my_line_chart = xlsx_drawing.createChart(anchor);

        XSSFChartLegend legend = my_line_chart.getOrCreateLegend();
        legend.setPosition(LegendPosition.BOTTOM);

        LineChartData drowingdata = my_line_chart.getChartDataFactory().createLineChartData();

        ChartAxis bottomAxis = my_line_chart.getChartAxisFactory().createCategoryAxis(AxisPosition.BOTTOM);
        ValueAxis leftAxis = my_line_chart.getChartAxisFactory().createValueAxis(AxisPosition.LEFT);
        leftAxis.setCrosses(AxisCrosses.AUTO_ZERO);

        ChartDataSource<Number> xs = DataSources.fromNumericCellRange(sheet, new CellRangeAddress(0, 0, 0, 4));
        ChartDataSource<Number> ys1 = DataSources.fromNumericCellRange(sheet, new CellRangeAddress(1, 1, 0, 4));
        ChartDataSource<Number> ys2 = DataSources.fromNumericCellRange(sheet, new CellRangeAddress(2, 2, 0, 4));
        ChartDataSource<Number> ys3 = DataSources.fromNumericCellRange(sheet, new CellRangeAddress(3, 3, 0, 4));
        ChartDataSource<Number> ys4 = DataSources.fromNumericCellRange(sheet, new CellRangeAddress(4, 5, 0, 4));

        drowingdata.addSeries(xs, ys1);
        drowingdata.addSeries(xs, ys2);
        drowingdata.addSeries(xs, ys3);
        drowingdata.addSeries(xs, ys4);
        /* Plot the chart with the inputs from drowingdata and chart axis */
        my_line_chart.plot(drowingdata, new ChartAxis[] { bottomAxis, leftAxis });
        /* Finally define FileOutputStream and write chart information */
        FileOutputStream fileOut = new FileOutputStream("xlsx-line-chart.xlsx");
        workbook.write(fileOut);
        fileOut.close();
    }


    private static List<String> getFieldNamesForClass(Class<?> clazz) throws Exception {
        List<String> rowName = new ArrayList<String>();
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            rowName.add(fields[i].getName());
        }
        return rowName;
    }


    private static String capitalize(String s) {
        if (s.length() == 0)
            return s;
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }


    }






