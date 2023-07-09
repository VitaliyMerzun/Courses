public class Main {

    public static void main(String[] args) throws InterruptedException {

        Resource resource=new Resource();

        Increaser increaser1 = new Increaser(resource, true);
        Increaser increaser2 = new Increaser(resource, true);
        Increaser increaser3 = new Increaser(resource, true);

        increaser1.start();
        increaser2.start();
        increaser3.start();

        try {
            increaser1.join();
            increaser2.join();
            increaser3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        increaser1.stop();
        increaser2.stop();
        increaser3.stop();

        resource.res = 0;

        Increaser increaser = new Increaser(resource);
        Decreaser decreaser = new Decreaser(resource);
        new Thread(increaser).start();
        new Thread(decreaser).start();



    }
}