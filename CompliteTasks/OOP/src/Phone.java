public class Phone {
    public int number;
    public int model;
    public float weight;


    public Phone(int number, int model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, int model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0f;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, Integer number) {
        System.out.println("Звонит " + name + " С номера "+number);
    }

    public void getNumber() {
        System.out.println(number);
    }

    public void sendMessage(Integer number) {
        System.out.println(number);
    }

    public void sendMessage(Integer[] numbers) {
        for (Integer integer : numbers) {
            System.out.println(integer);
        }
    }

    public void phoneToString() {
        System.out.println("Номер - " + number + " Модель - " + model + " Вес - " + weight);
    }

}
