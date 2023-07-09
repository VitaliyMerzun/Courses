import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RepeatedDataContainers.class)
@interface RepeatedDataContainer {

    int num();

    String str();

}