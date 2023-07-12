public class NegativeSumException extends BankOnlineException{

    public NegativeSumException() {
        System.out.println("Ошибка. Сумма перевода не может быть меньше 0.");
    }
}