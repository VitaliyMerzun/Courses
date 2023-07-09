public class Rectangle extends Figure implements Drawable {

    public float width;

    public float height;


    Rectangle(Point point, float width, float height){
        super(point);
        this.width = width;
        this.height = height;
    }

    public float area() {
        return width * height;
    }

    public float perimeter() {
        return width * 2 + height * 2;
    }

    public void draw() {
        System.out.println("Black rectangle. Point - " + point.x + " " + point.y);
    }

    public void draw(Color color) {
        System.out.println(color + " rectangle. Point - " + point.x + " " + point.y);
    }
}
