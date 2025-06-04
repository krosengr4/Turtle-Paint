public class TurtlePaint {

    UserInterface ui = new UserInterface();

    public void processMainMenuChoice() {
        boolean ifContinue = true;

        while (ifContinue) {
            int userHomeAction = ui.displayHomeScreen();

            switch (userHomeAction) {
                case 1 -> processShapeOption();
                case 2 -> processSaveOption();
                case 3 -> ifContinue = false;
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
        System.out.println("Square");
    }

    public void processTriangle() {
        System.out.println("Triangle!");
    }



}
