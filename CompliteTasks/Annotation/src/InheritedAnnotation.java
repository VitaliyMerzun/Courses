import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface InheritedAnnotation {
    String value();
}