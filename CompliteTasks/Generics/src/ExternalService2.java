public class ExternalService2 implements SomeInterface {

    public String request = "TRUE";

    public String interacted = "FALSE";

    public String respond = "FALSE";


    public void setRequest() { this.request = "TRUE"; }

    public void setInteracted() { this.interacted = "TRUE"; }

    public void setRespond() { this.respond = "TRUE"; }

    public void getRequest() {
        if (request == "TRUE")
            System.out.println("Запрос отправлен");
        else
            System.out.println("Запрос не отправлен");
    }

    public void getInteracted() {
        if (interacted == "TRUE")
            System.out.println("Запрос обработан");
        else
            System.out.println("Запрос не обработан");
    }

    public void getRespond() {
        if (respond == "TRUE")
            System.out.println("Запрос завершен");
        else
            System.out.println("Запрос не завершен");
    }

    public String toString() {
        return request + " -- " + interacted + " -- " + respond;
    }
}