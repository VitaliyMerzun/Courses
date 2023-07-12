import java.lang.annotation.*;
import java.lang.reflect.*;

@Repeatable(RepeatedDataContainers.class)
@interface RepeatedDataContainer {

    int num();

    String str();

}