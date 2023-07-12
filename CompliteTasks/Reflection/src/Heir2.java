import java.lang.reflect.Method;

class Heir2 extends Parent {

    @DataAnn(hour = 12, n = 7734, str = "12asd")
    public void myMethod1(int num, int hour, String str) {
        System.out.println("myMethod1 in Heir2 " + num + " " + hour + " " + str);
    }

    @DataAnn(hour = 12, n = 11111, str = "12asd")
    public void myMethod2(int num, int hour, String str) {
        System.out.println("myMethod2 in Heir2 " + num + " " + hour + " " + str);
    }

    @DataAnn(hour = 2, n = 1, str = "Three")
    public void myMethod3(int num, int hour, String str) {
        System.out.println("myMethod3 in Heir2 " + num + " " + hour + " " + str);
    }

}
