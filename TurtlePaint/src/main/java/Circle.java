import java.awt.*;

public class Circle extends Shape{

    int radius;

    public Circle(Turtle turtle, Point location, String color, int border, int radius) {
        super(turtle, location, color, border);
        this.radius = radius;
    }

    //region getters and setters
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    //endregion

    @Override
    public void paint(Shape shape) {
        System.out.println("Paint the circle!");
    }
}
