public class ExternalService1 implements SomeInterface {
    private boolean request = true;
    private boolean interacted = false;
    private boolean respond = false;

    @Override
    public void setRequest() {
        this.request = true;
    }

    @Override
    public void setInteracted() {
        this.interacted = true;
    }

    @Override
    public void setRespond() {
        this.respond = true;
    }

    @Override
    public void getRequest() {
        if (request)
            System.out.println("Запрос отправлен");
            else
            System.out.println("Запрос не отправлен");
    }

    @Override
    public void getInteracted() {
        if (interacted)
            System.out.println("Запрос обработан");
            else
            System.out.println("Запрос не обработан");
    }

    @Override
    public void getRespond() {
        if (respond)
            System.out.println("Запрос завершен");
        else
            System.out.println("Запрос не завершен");
    }

    @Override
    public String toString() {
        return request + " -- " + interacted + " -- " + respond;
    }
}