public class FigureTest {
    public static void main(String[] args) {

        Point point = new Point(10.0F, 5.0F);

        Rectangle rect = new Rectangle(point, 15.0F, 100.0F);

        System.out.println(rect.area());

        System.out.println(rect.perimeter());

        rect.draw();

        rect.draw(Color.MAGENTA);

    }
}
