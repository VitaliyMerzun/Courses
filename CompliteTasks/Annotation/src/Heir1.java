import java.lang.reflect.Method;
@InheritedAnnotation("Heir1")


class Heir1 extends Parent {



    @DataAnn(num = 12, str = "12asd")
    public static void myMethod() {
        Method method = null;
        try {
            method = Heir1.class.getMethod("myMethod");
            DataAnn anno = method.getAnnotation(DataAnn.class);
            System.out.println(anno.num() + " -- " + anno.str());

        } catch (NoSuchMethodException e) { }

    }


    public  static void main(String[] args) {
        Heir1 myObject = new Heir1();
        myObject.myMethod();
    }
}