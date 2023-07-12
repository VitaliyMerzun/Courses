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
    public void testSend_NullMoney_ThrowsNullArgumentException() {
        BankOnline card = new BankOnline();
        Assertions.assertThrows(NullArgumentException.class, () -> {
            card.send("1111111111111111", null);
        });
    }

    @Test
    public void testSend_InvalidCardNumber_ThrowsInvalidCardNumberException() {
        BankOnline card = new BankOnline();
        Assertions.assertThrows(InvalidCardNumber.class, () -> {
            card.send("123", 100.0);
        });
    }

    @Test
    public void testSend_BlockedCard_ThrowsBlockedCardException() {
        BankOnline card = new BankOnline();
        Assertions.assertThrows(BlockedCardException.class, () -> {
            card.send("1111111111111111", 100.0);
        });
    }

    @Test
    public void testSend_NegativeSum_ThrowsNegativeSumException() {
        BankOnline card = new BankOnline();
        Assertions.assertThrows(NegativeSumException.class, () -> {
            card.send("1234567890123456", -100.0);
        });
    }

    @Test
    public void testSend_OutOfLimitTransfer_ThrowsOutOfLimitTransferException() {
        BankOnline card = new BankOnline();
        Assertions.assertThrows(OutOfLimitTransferException.class, () -> {
            card.send("1234567890123456", 60000.0);
        });
    }

    @Test
    public void testSend_ValidCardNumberAndAmount_NoExceptionThrown() {
        BankOnline card = new BankOnline();
        Assertions.assertDoesNotThrow(() -> {
            card.send("1234567890123456", 100.0);
        });


    }
}

/*
        try {
            card.send( "1212232323343434", 60000.0);
        } catch (Throwable e) {}

        try {
            card.send( "1111111111111111", 30000.0);
        } catch (Throwable e) {}

        try {
            card.send( null, 30000.0);
        } catch (Throwable e) {}

        try {
            card.send( "121223232a", 60000.0);
        } catch (Throwable e) {}

        try {
            card.send( "1212232323343434", -60000.0);
        } catch (Throwable e) {}

    }
 */
