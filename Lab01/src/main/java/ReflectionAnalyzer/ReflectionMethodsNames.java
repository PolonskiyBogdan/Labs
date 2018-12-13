package ReflectionAnalyzer;

import fillers.Fillers;
import fillers.SpecialAnnotation;
import org.reflections.Reflections;
import sorters.AnotSorterClass;
import sorters.Sorter;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *  Class where Reflection methods for Filler and Sorters are created.
 * @author Polonskiy
 * @version 1.2
 */
public class ReflectionMethodsNames {
    private Fillers fillers = new Fillers();
    private Reflections reflections = new Reflections("sorters");

    /**
     * Method where we get names of {@link fillers.Fillers} methods using Reflection with annotation
     */
    public List<String> getRefFillName() {
        List<String> fillersList =  new ArrayList<>();
        Method[] methods = fillers.getClass().getMethods();
        for (Method method : methods) {
            SpecialAnnotation specialAnnotation = method.getAnnotation(SpecialAnnotation.class);
            if (specialAnnotation != null) {
                try {
                    fillersList.add(method.getName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return fillersList;
    }

    /**
     * Method where we get names of {@link sorters.Sorter} methods using Reflection with annotation
     */
    public List<String> getRefSortName(){
        List<String> sorterListName = new ArrayList<>();
        Set<Class<? extends Sorter>> subClasses = reflections.getSubTypesOf(Sorter.class);
        for (Class<? extends Sorter> abstractClass : subClasses) {
            AnotSorterClass anotSorterClass = abstractClass.getAnnotation(AnotSorterClass.class);
            if (anotSorterClass != null) {
                try {
                    sorterListName.add(abstractClass.getSimpleName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return sorterListName;
    }
}
