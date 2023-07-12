public class CircleTest {

    public static void main(String[] args) {
        Phone Samsung = new Phone();
        Samsung.number = 12;
        Samsung.model = 1;
        Samsung.weight = 4;

        Circle blackCircle = new Circle(13.5f,"Black");

        Circle whiteCircle = new Circle(7.0f,"White");

        System.out.println(blackCircle.area());
        System.out.println(blackCircle.perimeter());

        blackCircle.circleToString();
        whiteCircle.circleToString();
    }
}
