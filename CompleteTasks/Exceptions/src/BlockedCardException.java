public class BlockedCardException extends BankOnlineException{

    public BlockedCardException() {
        System.out.println("Ошибка. Карта заблокированна.");
    }
}