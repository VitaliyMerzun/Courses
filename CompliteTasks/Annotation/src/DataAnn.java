import java.lang.annotation.*;
import java.lang.reflect.*;

// сделать аннотацию MyAnno повторяющейся

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(DataAnns.class)
@interface DataAnn {

    int num() default 0;
    String str() default "-";
    boolean state() default true;
}