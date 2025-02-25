import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main {
    public static void addStreamContainers(List<StreamContainer> LSC, List<Long> L, List<String> S, int i1, int i2) {
        for (int i =i1;i < i2;i++) {
            StreamContainer SC = new StreamContainer(S.get(i), L.get(i));
            LSC.add(SC);
        }
    }

    @Test
    public void testStreams() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;
        PrintStream printStream = new PrintStream(output);
        System.setOut(printStream);

        IntStream intStream1 = IntStream.of(15, 42, 3, 6, 77, 10, 25, 92, 18, 67);
        intStream1.filter(n -> n >= 10 && n < 100).sorted().forEach(System.out::println);

        IntStream intStream2 = IntStream.of(15, 42, 3, 6, 77, 10, 25, 92, 18, 67);
        double average = intStream2.average().orElse(0);
        System.out.println("Среднее значение: " + average);

        Stream<String> stringStream = Stream.of("One", "Two", "Three", "Four");
        Stream<StreamContainer> streamContainerStream = stringStream.map(s -> new StreamContainer(s, new Random().nextLong() % 1000));
        Map<Long, String> streamMap = streamContainerStream.collect(Collectors.toMap(StreamContainer::getCount, StreamContainer::getName));
        System.out.println(streamMap);

        List<Long> L = List.of(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L);
        List<String> S = List.of("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
        List<StreamContainer> list1 = new ArrayList<>();
        List<StreamContainer> list2 = new ArrayList<>();
        List<StreamContainer> list3 = new ArrayList<>();
        addStreamContainers(list1, L, S, 0, 3);
        addStreamContainers(list2, L, S, 3, 6);
        addStreamContainers(list3, L, S, 6, 9);

        Map<String, List<StreamContainer>> mapStreamContainer = new HashMap<>();
        mapStreamContainer.put("111", list1);
        mapStreamContainer.put("222", list2);
        mapStreamContainer.put("333", list3);

        Stream<StreamContainer> stream = mapStreamContainer.values().stream().flatMap(List::stream);
        System.out.println(stream.count());

        String binString = "1001001110";
        boolean result = binString.chars().mapToObj(c -> c == '1').reduce(true, (a, b) -> a && b);
        System.out.println("Результат: " + result);

        String actualOutput = output.toString();

        String expectedOutput = "10\r\n" +
                "15\r\n" +
                "18\r\n" +
                "25\r\n" +
                "42\r\n" +
                "67\r\n" +
                "77\r\n" +
                "92\r\n" +
                "Среднее значение: 35.5\r\n" +
                streamMap.toString() +"\r\n" +
                "9\r\n" +
                "Результат: false\r\n";


        Assertions.assertEquals(expectedOutput, actualOutput);

    }
}