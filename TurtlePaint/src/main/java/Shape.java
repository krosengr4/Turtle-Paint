import java.awt.*;

public abstract class Shape {

    Turtle turtle;
    Point location; //<--- location of where to draw the shape
    String color; //<--- color used for border
    int border; //<--- width of the shape border

    public Shape (Turtle turtle, Point location, String color, int border) {
        this.turtle = turtle;
        this.location = location;
        this.color = color;
        this.border = border;
    }

    public abstract void paint();

}
