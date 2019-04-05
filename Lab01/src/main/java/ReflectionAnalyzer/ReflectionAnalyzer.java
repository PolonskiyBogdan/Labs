package ReflectionAnalyzer;

import excel.Datatime;
import fillers.Fillers;
import fillers.SpecialAnnotation;
import org.reflections.Reflections;
import sorters.Sorter;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;


/**
 *  Class where Reflection methods for Filler and Sorters are created.
 * @author Polonskiy
 * @version 1.2
 */
 public class ReflectionAnalyzer {
     /**
     * Method where we get {@link fillers.Fillers} methods using Reflection with annotation
     */
//    private int counter= 0;
    Datatime datatime = new Datatime();
    private int [] refFill() {
        Fillers fillers = new Fillers();

        List<Object> list = new ArrayList<>();
        int [] array = new int[0];
        Method[] methods = fillers.getClass().getMethods();
            for (Method method : methods) {
            SpecialAnnotation specialAnnotation = method.getAnnotation(SpecialAnnotation.class);
            list.add(specialAnnotation);
            if (specialAnnotation != null) {
                try {
                   array =(int[]) method.invoke(specialAnnotation);
//                    System.out.println(Arrays.toString(array));
//                    System.out.println(specialAnnotation.name());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return array;
    }

    /**
     * Method where we get  Sorters method using Reflection to find all subClasses of {@link sorters.Sorter}
     */
    private List<Sorter> refSort() {
        Reflections reflections = new Reflections("sorters");
        List<Sorter> sorterArrayList = new ArrayList<>();
        Set<Class<? extends Sorter>> subClasses = reflections.getSubTypesOf(Sorter.class);
        for (Class<? extends Sorter> abstractClass : subClasses) {
            if (!Modifier.isAbstract(abstractClass.getModifiers())) {
                try {
                    Sorter sorter = abstractClass.newInstance();
                    sorterArrayList.add(sorter);
                    sorterArrayList.sort(new MyComparatorForSorter());

                } catch (IllegalAccessException | InstantiationException e) {
                    e.printStackTrace();
                  }
            }
        }
//        System.out.println(sorterArrayList);
        return sorterArrayList;
    }

    /**
     * Method that analyze speed of  Sorters from{@link #refSort()} and Fillers from {@link #refFill()}
     */
    public List<Long> analyzer(){
        int[] array =refFill();
         List<Sorter> sorterArrayList = refSort();

        List<Long> timelist = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            for (Sorter sorter : sorterArrayList) {
                long startTime = System.nanoTime();
                sorter.sorter(array);
                long endTime = System.nanoTime();
                timelist.add(endTime - startTime);
//                System.out.println(endTime - startTime);


            }
        }
        System.out.println(timelist);
        datatime.setTime(timelist);
        return timelist;
    }

 }


