
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface RepeatedDataContainers {
    RepeatedDataContainer[] value();
}