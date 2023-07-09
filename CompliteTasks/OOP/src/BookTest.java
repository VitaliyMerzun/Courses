public class BookTest {

    public static void main(String[] args) {
        Author Barushu = new Author("Barushu", "Male", "-");
        Book LandOfShadows = new Book("Land of Shadows", Barushu, 4698);

        System.out.println(Barushu.toString());
        System.out.println(LandOfShadows.toString());
    }
}
