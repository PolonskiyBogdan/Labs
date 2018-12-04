package ReflectionAnalyzer;
import fillers.Fillers;
import fillers.SpecialAnnotation;
import org.reflections.Reflections;
import sorters.Sorter;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 *  Class where Reflection methods for Filler and Sorters are created.
 * @author Polonskiy
 * @version 1.2
 */
 public class ReflectionAnalyzer {
//int counter= 0;
    /**
     * Method where we get {@link fillers.Fillers} methods using Reflection with annotation
     */
    private   int[] refFill() {
        Fillers fillers = new Fillers();
        Method[] methods = fillers.getClass().getMethods();
        int [] array = new int[0];
        for (Method method : methods) {
            SpecialAnnotation specialAnnotation = method.getAnnotation(SpecialAnnotation.class);
            if (specialAnnotation != null) {
                try {
                   array =(int[]) method.invoke(specialAnnotation);
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
    private   List<Sorter> refSort() {
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
//        int quantityOfSorters = sorterArrayList.size();
//        System.out.println(quantityOfSorters);
        System.out.println(sorterArrayList);
        return sorterArrayList;
    }

    public void Analyzer(){
//        int quantityOfFillers = array.length;
//        System.out.println(quantityOfFillers);
//        int quantityOfSorters = sorterArrayList.size();
        int [] fillerArray = refFill();
        List<Sorter> sorterArrayList = refSort();

        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < quantityOfSorters; j++) {
            for (Sorter sorter : sorterArrayList) {
                long startTime = System.nanoTime();
                sorter.sorter(fillerArray);
//                counter++;
                long endTime = System.nanoTime();
                System.out.println(endTime - startTime);
//                System.out.println(counter);
            }
        }
    }
 }


