import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankOnline {
    private static List<String> blocked = Arrays.asList("1111111111111111", "2222222222222222", "3333333333333333");

    public void send(String cardNumber, Double money) throws BankOnlineException {
        if (cardNumber == null || money == null) {
            throw new NullArgumentException();
        }

        boolean isOnlyDigits = true;
        for (int i = 0; i < cardNumber.length() && isOnlyDigits; i++) {
            if (!Character.isDigit(cardNumber.charAt(i))) {
                isOnlyDigits = false;
            }
        }

        if (cardNumber.length() != 16 || !isOnlyDigits) {
            throw new InvalidCardNumber();
        }

        if (blocked.contains(cardNumber)) {
            throw new BlockedCardException();
        }

        if (money < 0) {
            throw new NegativeSumException();
        }

        if (money > 50000) {
            throw new OutOfLimitTransferException();
        }
    }
}
