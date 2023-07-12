public class OutOfLimitTransferException extends BankOnlineException{

    public OutOfLimitTransferException() {
        System.out.println("Ошибка. Сумма перевода превышает 50000.");
    }
}