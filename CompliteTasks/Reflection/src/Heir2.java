import java.lang.reflect.Method;

class Heir2 extends Parent {

    @DataAnn(hour = 12, n = 1, str = "12asd")
    public static void myMethod1(int num, int hour, String str) {
        System.out.println("myMethod1 in Heir2" + num + " " + hour + " " + str);
    }

    @DataAnn(hour = 12, n = 1, str = "12asd")
    public static void myMethod2(int num, int hour, String str) {
        System.out.println("myMethod2 in Heir2" + num + " " + hour + " " + str);
    }
}
