import java.lang.reflect.Method;
@InheritedAnnotation("Heir1")
class Heir1 extends Parent {

    @DataAnn(hour = 12, n = 1, str = "12asd")
    public void myMethod1(int num, int hour, String str) {
        System.out.println("myMethod1 in Heir1 " + num + " " + hour + " " + str);
    }

    @DataAnn(hour = 12, n = 2, str = "12asd")
    public void myMethod2(int num, int hour, String str) {
        System.out.println("myMethod2 in Heir1 " + num + " " + hour + " " + str);
    }


    public static void main(String[] args) {
        Heir1 heir = new Heir1();
        Method method;
        try {
            method = heir.getClass().getMethod("myMethod2", int.class, int.class, String.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        DataAnn ann = method.getAnnotation(DataAnn.class);
        heir.myMethod2(ann.n(), ann.hour(), ann.str());

    }
}