public class Triangle extends Figure implements Drawable{

    public float height;
    public float side;


    Triangle(Point point, float width, float height){
        super(point);
        this.height = height;
        this.side = side;
    }
    public float area() {
        return (height * side) / 2;
    }

    public float perimeter() {
        return side * 3;
    }


    public void draw() {
        System.out.println("Black triangle. Point - " + point.x + " " + point.y);
    }

    public void draw(Color color) {
        System.out.println(color + " triangle. Point - " + point.x + " " + point.y);
    }
}
