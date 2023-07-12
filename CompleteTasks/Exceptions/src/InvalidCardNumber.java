public class InvalidCardNumber extends BankOnlineException{

    public InvalidCardNumber() {
        System.out.println("Ошибка. Введён неверный номер карты.");
    }

}