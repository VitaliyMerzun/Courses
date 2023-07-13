public class ResourceProcessor {

    public static void decreas(Resource resource) {
        synchronized (resource) {
            while (resource.res < 1) {
                try {
                    resource.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            resource.res--;
            System.out.println("Уменьшено до: " + resource.res);
            resource.notify();
        }
    }

    public static void increas(Resource resource) {
        synchronized (resource) {
            while (resource.res >= 5) {
                try {
                    resource.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            resource.res++;
            System.out.println("Увеличено до: " + resource.res);
            resource.notify();
        }
    }
}