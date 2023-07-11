import java.lang.reflect.Method;
@InheritedAnnotation("Heir1")
class Heir1 extends Parent {



    @DataAnn(num = 1,hour = 12, str = "12asd")
    public static void myMethod1(int num, int hour, String str) {
            System.out.println("myMethod1 in Heir1" + num + " " + hour + " " + str);
    }

    @DataAnn(num = 3,hour = 12, str = "12asd")
    public static void myMethod2(int num, int hour, String str) {
        System.out.println("myMethod2 in Heir1" + num + " " + hour + " " + str);
    }

    public static void main(String[] args) throws NoSuchMethodException{

        Heir1 heir = new Heir1();
        Method method = heir.getClass().getMethod("myMethod");
        DataAnn ann = method.getAnnotation(DataAnn.class);
        myMethod1(ann.hour(), ann.num(), ann.str());
    }
}