import java.awt.*;

public class Hexagon extends Shape{

    int sideLength;

    public Hexagon (Turtle turtle, Point location, String color, int border, int sideLength) {
        super(turtle, location, color, border);
        this.sideLength = sideLength;
    }

    //region getters and setters
    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
    //endregion

    @Override
    public void paint(Shape shape) {
        System.out.println("Paint the hexagon!");
    }
}
