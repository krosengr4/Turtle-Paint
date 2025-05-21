import java.awt.*;

public class Square extends Shape {

    int sideLength;

    public Square(Turtle turtle, Point location, String color, int border, int sideLength) {
        super(turtle, location, color, border);
        this.sideLength = sideLength;
    }

    //region getters and setters
    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }
    //endregion

    @Override
    public void paint() {
        System.out.println("Paint Square!");
    }
}
