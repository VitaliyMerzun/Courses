import java.lang.reflect.Method;

class Heir2 extends Parent {

    @DataAnn(num = 1,hour = 12, str = "12asd")
    public static void myMethod1(int num, int hour, String str) {
        System.out.println("myMethod1 in Heir2" + num + " " + hour + " " + str);
    }

    @DataAnn(num = 3,hour = 12, str = "12asd")
    public static void myMethod2(int num, int hour, String str) {
        System.out.println("myMethod2 in Heir2" + num + " " + hour + " " + str);
    }
}
