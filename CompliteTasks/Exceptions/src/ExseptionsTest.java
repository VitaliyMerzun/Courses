public class ExseptionsTest {

    public static void main(String[] args) throws BankOnlineException {

        BankOnline card = new BankOnline();

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
}
