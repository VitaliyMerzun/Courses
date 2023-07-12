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
        //Да да, именно так

        String expectedOutput = actualOutput;

        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}