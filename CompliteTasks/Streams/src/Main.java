import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        IntStream intStream1 = IntStream.of(15, 42, 3, 6, 77, 10, 25, 92, 18, 67);
        intStream1.filter((n) -> n >= 10 && n < 100).sorted().forEach(System.out::println);

        IntStream intStream2 = IntStream.of(15, 42, 3, 6, 77, 10, 25, 92, 18, 67);
        double average = intStream2.average().orElse(0);
        System.out.println("Среднее значение: " + average);

        Stream<String> stringStream = Stream.of("One", "Two", "Three", "Four");
        Stream<StreamContainer> streamContainerStream = stringStream.map((s) -> new StreamContainer(s, new Random().nextLong()%1000));
        Map<Long, String> streamMap = streamContainerStream.collect(Collectors.toMap(StreamContainer::getCount, StreamContainer::getName));
        System.out.println(streamMap);

        Map<String, Long> stringLongMap = Map.of("One", 1L, "Two", 2L, "Three", 3L);
        Stream<StreamContainer> mapStream = stringLongMap.entrySet().stream().map((s) -> new StreamContainer(s.getKey(), s.getValue()));
        System.out.println(mapStream.count());

        String binString = "1001001110";
        Stream<Boolean> boolStream = binString.chars().mapToObj(c -> c == '1');
        boolean result = boolStream.reduce(true, (a, b) -> a && b);
        System.out.println("Result: " + result);



    }
}