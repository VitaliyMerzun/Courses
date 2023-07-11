import java.lang.annotation.*;


@Repeatable(Clocks.class)
public @interface Clock {

    int weekDay();


}