import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Main {
    @Test
    public void testSound()   {

        List<Sounding> animalList = new ArrayList<>();

        animalList.add(new Cat());
        animalList.add(new Dog());
        animalList.add(new Sounding() {
            @Override
            public void sound() {
                System.out.println("Croak");
            }});
        animalList.add(() -> System.out.println("Quack"));
        animalList.add(OtherAnimalSounding::soundOwl);
        animalList.add(OtherAnimalSounding::soundDolphin);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;
        PrintStream printStream = new PrintStream(output);
        System.setOut(printStream);

        animalList.forEach(Sounding::sound);

        String actualOutput = output.toString();

        String expectedOutput = "Meow\r\n" +
                "Bark\r\n" +
                "Croak\r\n" +
                "Quack\r\n" +
                "Hood\r\n" +
                "Click\r\n";

        Assertions.assertEquals(expectedOutput, actualOutput);

    }
}