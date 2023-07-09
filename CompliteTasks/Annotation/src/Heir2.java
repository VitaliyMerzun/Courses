import java.lang.reflect.Method;

class Heir2 extends Parent {

    @DataAnn(num = 12, str = "1232qwerty")
    public static void myMethod() {
        Method method = null;
        try {
            method = Heir2.class.getMethod("myMethod");
            DataAnn anno = method.getAnnotation(DataAnn.class);
            System.out.println(anno.num() + " -- " + anno.str());

        } catch (NoSuchMethodException e) { }

    }
}
