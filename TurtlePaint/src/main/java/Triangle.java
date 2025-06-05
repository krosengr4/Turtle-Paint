import java.awt.*;

public class Triangle extends Shape{

    int base;
    int height;

    public Triangle(Turtle turtle, Point location, String color, int border, int base, int height) {
        super(turtle, location, color, border);
        this.base = base;
        this.height = height;
    }

    //region Getters and Setters
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    //endregion

    @Override
    public void paint(Shape shape) {
        System.out.println("Paint the triangle!");
    }
}
