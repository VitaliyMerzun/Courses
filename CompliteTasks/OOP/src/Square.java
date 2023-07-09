public class Square extends Figure implements Drawable {

    public float side;


    Square(Point point, float side){
        super(point);
        this.side = side;
    }
    public float area() {
        return side * 4;
    }

    public float perimeter() {
        return side * 4;
    }

    public void draw() {
        System.out.println("Black square. Point - " + point.x + " " + point.y);
    }

    public void draw(Color color) {
        System.out.println(color + " square. Point - " + point.x + " " + point.y);
    }
}
