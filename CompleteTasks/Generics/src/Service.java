public class Service<T extends SomeInterface> {
    private T object;

    public Service(T object) {
        this.object = object;
    }

    public void serviceInfo() {
        object.getRequest();
        object.getInteracted();
        object.getRespond();
    }

    public void serviceWork() {
        object.setInteracted();
        object.setRespond();
        System.out.println("Запрос отправлен и обработан");
        System.out.println(object.toString());
    }
}
