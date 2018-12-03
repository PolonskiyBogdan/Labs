package ReflectionAnalyzer;

/**
 *  Class where Reflection methods for Filler and Sorters are contained.
 * @author Polonskiy
 * @version 1.2
 */
import static fillers.Fillers.*;
import fillers.Fillers;
import org.reflections.Reflections;
import sorters.Sorter;


import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


/**
 * not finished yet <br>
 */
 public class RefAnalyze {

    public static void refFill() {
        Fillers fillers = new Fillers();
        Method[] methods = fillers.getClass().getMethods();
        for (Method method : methods) {
            SpecAnot specAnot = method.getAnnotation(SpecAnot.class);
            if (specAnot != null) {
                try {
                    System.out.println(method.invoke(specAnot));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void refSort() {
        List<Sorter> sorters = new ArrayList<>();
        Reflections reflections = new Reflections("sorters");

        Set<Class<? extends Sorter>> subClasses = reflections.getSubTypesOf(Sorter.class);
        for (Class<? extends Sorter> abstractClass : subClasses) {
            if (!Modifier.isAbstract(abstractClass.getModifiers())) {

                try {
                    Sorter sorter = abstractClass.newInstance();
                    sorters.add(sorter);

                } catch (IllegalAccessException | InstantiationException e) {
                    e.printStackTrace();
                  }

            }
        }
        System.out.println(sorters);
    }


 }


