package ReflectionAnalyzer;

/**
 *  Main is a class where Analyze methods are summoned  <br>
 * @author Polonskiy
 * @version 1.2
 */
import fillers.Fillers;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * not finished yet <br>
 */
public class RefAnalyze {

    public static void refFill(){
        Fillers fillers = new Fillers();
        Method [] methods = fillers.getClass().getMethods();
            for (Method method :methods){
                Fillers.SpecAnot specAnot = method.getAnnotation(Fillers.SpecAnot.class);
                if(specAnot != null){
                    try {
//                        Arrays.sort(method.getDeclaredAnnotations());
                        System.out.println(method.invoke(specAnot));
                    } catch (Exception e){
                        e.printStackTrace();
                    }


                }
                }


    }
    public static void refSort(){

    }

}
