public class ResourceProcessor {

    public static synchronized void decreas(Resource resource) {
        resource.res--;
    }

    public static synchronized void increas(Resource resource) {
        resource.res++;
    }
}
