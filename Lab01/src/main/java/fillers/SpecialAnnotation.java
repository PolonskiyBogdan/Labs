package fillers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * Created annotation <br>
 * used to mark Fillers methods for Reflection <br>
 * has name as it parameter
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface SpecialAnnotation {
    String name();

}


