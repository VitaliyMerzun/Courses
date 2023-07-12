import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReflectionTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //Информация берётся из класса Heir2, а создаётся объект класса Heir1
        int weekdayValue = ReflectionClass.getWeekdayDate(Heir2.class);
        Parent heir1 = ReflectionClass.myMethod(weekdayValue);
        assert heir1 != null;
        System.out.println("Создан объект: " + heir1.getClass().getSimpleName());
        Class<?> clazz = heir1.getClass();

        List<Method> methodList = new ArrayList<>();

        for (Method method : clazz.getMethods()) {
            if (method.isAnnotationPresent(DataAnn.class)) {
                methodList.add(method);
            }
        }

        methodList.sort(Comparator.comparingInt((Method method) -> method.getAnnotation(DataAnn.class).n()));

        for (Method method : methodList) {
            DataAnn annotation = method.getAnnotation(DataAnn.class);
            method.invoke(heir1, annotation.n(), annotation.hour(), annotation.str());
        }




    }
}
