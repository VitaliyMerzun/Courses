import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ExseptionsTest {


    @Test
    public void testSend_NullCardNumber_ThrowsNullArgumentException() {
        BankOnline card = new BankOnline();
        Assertions.assertThrows(NullArgumentException.class, () -> {
            card.send(null, 100.0);
        });
    }


    @Test
    public void testNullMoney() {
        BankOnline card = new BankOnline();
        Assertions.assertThrows(NullArgumentException.class, () -> {
            card.send("1111111111111111", null);
        });
    }

    @Test
    public void testInvalidCardNumber() {
        BankOnline card = new BankOnline();
        Assertions.assertThrows(InvalidCardNumber.class, () -> {
            card.send("123", 100.0);
        });
    }

    @Test
    public void testBlockedCardException() {
        BankOnline card = new BankOnline();
        Assertions.assertThrows(BlockedCardException.class, () -> {
            card.send("1111111111111111", 100.0);
        });
    }

    @Test
    public void testNegativeSumException() {
        BankOnline card = new BankOnline();
        Assertions.assertThrows(NegativeSumException.class, () -> {
            card.send("1234567890123456", -100.0);
        });
    }

    @Test
    public void testOutOfLimitTransferException() {
        BankOnline card = new BankOnline();
        Assertions.assertThrows(OutOfLimitTransferException.class, () -> {
            card.send("1234567890123456", 60000.0);
        });
    }

    @Test
    public void testNoExceptionThrown() {
        BankOnline card = new BankOnline();
        Assertions.assertDoesNotThrow(() -> {
            card.send("1234567890123456", 100.0);
        });


    }
}