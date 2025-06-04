import java.awt.*;

public class TurtlePaint {

    UserInterface ui = new UserInterface();

    World world = new World(100, 100, Color.BLACK);

    public void processMainMenuChoice() {
        boolean ifContinue = true;

        while (ifContinue) {
            int userHomeAction = ui.displayHomeScreen();

            switch (userHomeAction) {
                case 1 -> processShapeOption();
                case 2 -> processSaveOption();
                case 0 -> ifContinue = false;
                default -> System.err.println("ERROR! Please enter the number of an option that was listed!");
            }
        }



    }

    public void processShapeOption() {
        boolean shapeMenuContinue = true;

        while (shapeMenuContinue) {
            int userShapeOption = ui.DisplayShapeChoice();

            switch (userShapeOption) {
                case 1 -> processSquare();
                case 2 -> processCircle();
                case 3 -> processTriangle();
                case 4 -> shapeMenuContinue = false;
                default -> System.err.println("ERROR!Please enter the number of an option that was listed!");
            }
        }

    }

    //! Add to this
    public void processSaveOption() {
        System.out.println("Your shape was saved!");
    }

    public void processCircle() {
        System.out.println("Circle!");
    }

    public void processSquare() {
        int squareLength = ui.displaySquareOptions();
        String shapeColor = processShapeColor();

        Point location = new Point(25, 25);
        Turtle turtle = new Turtle(25, 25, world);

        Square square = new Square(turtle, location, shapeColor, squareLength);
        square.paint();
    }

    public void processTriangle() {
        System.out.println("Triangle!");
    }

    public String processShapeColor() {
        int shapeColorChoice = ui.displayColorOptions();
        String shapeColor = "";

        switch (shapeColorChoice) {
            case 1 -> shapeColor = "red";
            case 2 -> shapeColor = "magenta";
            case 3 -> shapeColor = "blue";
            case 4 -> shapeColor = "cyan";
            case 5 -> shapeColor = "green";
            default -> System.err.println("ERROR! Please select a number that is in the list!");
        }

        return shapeColor;
    }


}
