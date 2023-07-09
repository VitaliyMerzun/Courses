public class PhoneTest {

    public static void main(String[] args) {
        Phone ASUS = new Phone();
        ASUS.number = 12;
        ASUS.model = 1;
        ASUS.weight = 4;

        Phone Nokia = new Phone(13,2,5);

        Phone Samsung = new Phone(14,3);

        ASUS.getNumber();
        Nokia.getNumber();
        Samsung.getNumber();

        ASUS.receiveCall("Labar");
        Nokia.receiveCall("Georai");

        Integer[] numArray  = {11,12,13,14};
        Nokia.sendMessage(numArray);

        Nokia.phoneToString();

        System.out.println("Samsung: number="+ ASUS.number+" model="+ASUS.model+" weight="+ASUS.weight);
        System.out.println("Nokia: number="+ Nokia.number+" model="+Nokia.model+" weight="+Nokia.weight);
        System.out.println("Meizu: number="+ Samsung.number+" model="+Samsung.model+" weight="+Samsung.weight);
    }
}
