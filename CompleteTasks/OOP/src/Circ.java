public class Circ extends Figure implements Drawable {

    public float radius;

    Circ(Point point, float radius){

        super(point);
        this.radius = radius;
    }

    public float area() {
        return 3.14F * radius * radius;
    }


    public float perimeter() {
        return 2 * 3.14F * radius;
    }

    public void draw() {
        System.out.println("Black circle. Point - " + point.x + " " + point.y);
    }

    public void draw(Color color) {
        System.out.println(color + " circle. Point - " + point.x + " " + point.y);
    }


}