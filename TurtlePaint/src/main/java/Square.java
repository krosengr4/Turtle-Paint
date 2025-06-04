import java.awt.*;

public class Square extends Shape {

    int sideLength;

    public Square(Turtle turtle, Point location, String color, int borderWidth) {
        super(turtle, location, color, borderWidth);
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
