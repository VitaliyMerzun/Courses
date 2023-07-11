import java.lang.annotation.*;
import java.lang.reflect.*;


@Repeatable(DataAnns.class)
@interface DataAnn {
    int hour() default 0;
    int prior() default 0;
    String str() default "-";

}