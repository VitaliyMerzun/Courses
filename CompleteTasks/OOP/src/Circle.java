public class Circle {
    public float radius;
    public String color;

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public float area() {
        return radius * 2 * 3.14f;
    }

    public float perimeter() {
        return radius * radius * 3.14f;
    }

    public void circleToString() {
        System.out.println(radius + " " + color  + " " + this.area()  + " " + this.perimeter());
    }

}
