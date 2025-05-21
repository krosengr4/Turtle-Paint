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

    //region getter and setters
    public Turtle getTurtle() {
        return turtle;
    }

    public void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBorder() {
        return border;
    }

    public void setBorder(int border) {
        this.border = border;
    }
    //endregion

    public abstract void paint();

}
