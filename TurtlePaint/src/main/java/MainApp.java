import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(200, 200, Color.BLACK);
        Turtle turtle = new Turtle(world,-50, -50);
        
        int width = 100;
        int height = 100;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);

        turtle.setPenWidth(5);
        turtle.setColor(Color.cyan);

        //makes a square
        turtle.turnRight(90);
        turtle.forward(100);

        turtle.setColor(Color.RED);
        turtle.turnLeft(90);
        turtle.forward(100);

        turtle.setColor(Color.GREEN);
        turtle.turnLeft(90);
        turtle.forward(100);

        turtle.setColor(Color.magenta);
        turtle.turnLeft(90);
        turtle.forward(100);

        //Makes an X inside the square
        turtle.setColor(Color.YELLOW);
        turtle.turnLeft(135);
        turtle.forward(hypotenuse);

        turtle.penUp();
        turtle.goTo(50, 50);
        turtle.turnRight(90);

        turtle.penDown();
        turtle.forward(hypotenuse);

//        turtle.setPenWidth(5);
//        turtle.setColor(Color.RED);
//
//        turtle.turnRight(45);
//        turtle.forward(hypotenuse);
//
//        turtle.setColor(Color.GREEN);
//
//        turtle.penUp();
//        turtle.goTo(-100, 100);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);
    }
}
