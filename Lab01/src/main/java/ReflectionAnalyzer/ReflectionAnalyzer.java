package ReflectionAnalyzer;
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
    private int[] refFill() {
        Fillers fillers = new Fillers();
        int [] array = new int[0];
        Method[] methods = fillers.getClass().getMethods();
            for (Method method : methods) {
            SpecialAnnotation specialAnnotation = method.getAnnotation(SpecialAnnotation.class);
            if (specialAnnotation != null) {
                try {
                   array =(int[]) method.invoke(specialAnnotation);
//                    System.out.println(method.getName());
                    System.out.println(Arrays.toString(array));
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

                } catch (IllegalAccessException | InstantiationException e) {
                    e.printStackTrace();
                  }
            }
        }
        sorterArrayList.sort(new MyComparator());
//        System.out.println(sorterArrayList);
        return sorterArrayList;
    }

    /**
     * Method that analyze speed of  Sorters from{@link #refSort()} and Fillers from {@link #refFill()}
     */
    public void analyzer(){
        List<Sorter> sorterArrayList = refSort();
        int [] fillerArray = refFill();
        for (int i = 0; i < 4; i++) {
            for (Sorter sorter : sorterArrayList) {
                long startTime = System.nanoTime();
                sorter.sorter(fillerArray);
                long endTime = System.nanoTime();
                System.out.println(endTime - startTime);
//                counter++;
//                System.out.println("number of sorts =" + counter);
            }
        }
    }


 }


