import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class ReflectionTest {

    @Test
    public void testReflection() throws InvocationTargetException, IllegalAccessException {
        //Перехватывает вывод в консоль
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;
        PrintStream printStream = new PrintStream(output);
        System.setOut(printStream);

        int weekdayValue = ReflectionClass.getWeekdayDate(Heir2.class);
        Parent heir1 = ReflectionClass.myMethod(weekdayValue);
        Assertions.assertNotNull(heir1);

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

        System.out.flush();
        System.setOut(originalOutput);

        String actualOutput = output.toString();
        System.out.println(actualOutput);

        String expectedOutput = "Создан объект: Heir1\r\n" +
                "myMethod3 in Heir1:  priority = 1 hour =  2 str = Three\r\n" +
                "DataContainer(num=2, str=Three)\r\n" +
                "myMethod1 in Heir1:  priority = 7734 hour =  12 str = 12asd\r\n" +
                "DataContainer(num=12, str=12asd)\r\n" +
                "myMethod2 in Heir1:  priority = 11111 hour =  12 str = 12asd\r\n" +
                "DataContainer(num=12, str=12asd)\r\n";

        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}