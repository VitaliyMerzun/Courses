import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(DataAnns.class)
@interface DataAnn {
    int hour() default 0;
    int n() default 0;
    String str() default "-";

}