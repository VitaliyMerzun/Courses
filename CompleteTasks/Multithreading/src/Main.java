public class Main {

    public static void main(String[] args) throws InterruptedException {

        Resource resource = new Resource();

        Increaser increaser = new Increaser(resource);
        Decreaser decreaser = new Decreaser(resource);
        new Thread(increaser).start();
        new Thread(decreaser).start();
    }
}