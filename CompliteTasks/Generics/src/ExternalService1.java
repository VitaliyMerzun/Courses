public class ExternalService1 implements SomeInterface {

    public boolean request = true;

    public boolean interacted = false;

    public boolean respond = false;


    public void setRequest() { this.request = true; }

    public void setInteracted() { this.interacted = true; }

    public void setRespond() { this.respond = true; }

    public void getRequest() {
        if (request)
            System.out.println("Запрос отправлен");
        else
            System.out.println("Запрос не отправлен");
    }

    public void getInteracted() {
        if (interacted)
            System.out.println("Запрос обработан");
        else
            System.out.println("Запрос не обработан");
    }

    public void getRespond() {
        if (respond)
            System.out.println("Запрос завершен");
        else
            System.out.println("Запрос не завершен");
    }

    public String toString() {
        return request + " -- " + interacted + " -- " + respond;
    }

}