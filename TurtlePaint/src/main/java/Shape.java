import java.awt.*;

public abstract class Shape {

    Turtle turtle;
    Point location; //<--- location of where to draw the shape
    String color; //<--- color used for border
    int border; //<--- width of the shape border


    public abstract void paint();

}
