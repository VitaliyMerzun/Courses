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
                System.out.print("Croak");
            }});
        animalList.add(() -> System.out.print("Quack"));
        animalList.add(OtherAnimalSounding::soundOwl);
        animalList.add(OtherAnimalSounding::soundDolphin);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;
        PrintStream printStream = new PrintStream(output);
        System.setOut(printStream);

        animalList.forEach(Sounding::sound);

        String actualOutput = output.toString();

        String expectedOutput = "Meow" +
                "Bark" +
                "Croak" +
                "Quack" +
                "Hood" +
                "Click";

        Assertions.assertEquals(expectedOutput, actualOutput);

    }
}