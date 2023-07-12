public class ExternalService2 implements SomeInterface {
    private String request = "TRUE";
    private String interacted = "FALSE";
    private String respond = "FALSE";

    @Override
    public void setRequest() {
        request = "TRUE";
    }

    @Override
    public void setInteracted() {
        interacted = "TRUE";
    }

    @Override
    public void setRespond() {
        respond = "TRUE";
    }

    @Override
    public void getRequest() {
        if (request.equals("TRUE")) {
            System.out.println("Запрос отправлен");
        } else
            System.out.println("Запрос не отправлен");
    }

    @Override
    public void getInteracted() {
        if (interacted.equals("TRUE"))
            System.out.println("Запрос обработан");
        else
            System.out.println("Запрос не обработан");
    }

    @Override
    public void getRespond() {
        if (respond.equals("TRUE"))
            System.out.println("Запрос завершен");
        else
            System.out.println("Запрос не завершен");
    }

    @Override
    public String toString() {
        return request + " -- " + interacted + " -- " + respond;
    }
}