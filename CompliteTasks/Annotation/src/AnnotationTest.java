import java.lang.reflect.Method;

public class AnnotationTest {

    public  static void main(String[] args) {

        Parent parent = new Parent();
        DataAnn annotation = parent.getClass().getAnnotation(DataAnn.class);
        System.out.println(annotation.n() + " -- " + annotation.str());

        Heir1 newDataHeir = new Heir1();
        //Heir1.myMethod();

        Heir2 oldDataHeir = new Heir2();
        //Heir2.myMethod();

    }

}
