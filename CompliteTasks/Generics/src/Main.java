import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static <T> void elemSwap(Collection<T> collection, int index1, int index2) {
        List<T> list = new ArrayList<>(collection);

        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);

        collection.clear();
        collection.addAll(list);
    }

    public static void swap(Collection<?> collection, int index1, int index2) {
        elemSwap(collection, index1, index2);
    }

    public static <T extends Number> int countEvenElements(Collection<T> collection) {
        int count = 0;
        for (T element : collection) {
            if (element.intValue() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println(list);
        elemSwap(list, 1, 7);
        System.out.println(list);

        System.out.println(countEvenElements(list));

        System.out.println(list);
        swap(list, 1, 7);
        System.out.println(list);

        ExternalService1 server1 = new ExternalService1();
        ExternalService2 server2 = new ExternalService2();

        Service<ExternalService1> service1 = new Service<>(server1);
        service1.serviceInfo();
        service1.serviceWork();
        service1.serviceInfo();

        System.out.println();

        Service<ExternalService2> service2 = new Service<>(server2);
        service2.serviceInfo();
        service2.serviceWork();
        service2.serviceInfo();
    }
}