public class UserInterface {

    public int displayHomeScreen() {
        System.out.println("\t\t---OPTIONS:---");
        System.out.println("1 - Add Shape\n2 - Save Image\n0 - Exit");
        return Utils.messageAndResponseInt("Please Enter Your Option: ");

    }

    public int DisplayShapeChoice() {
        System.out.println("\t\t---SHAPE OPTIONS:---");
        System.out.println("1 - Square\n2 - Circle\n3 - Triangle\n4 - Go back");
        return Utils.messageAndResponseInt("Which Shape Do You Choose?: ");
    }

    public int[] DisplayCircleOptions() {
         int circleRadius = Utils.messageAndResponseInt("What is the radius?: ");
         int circleDiameter = Utils.messageAndResponseInt("What is the width?: ");
         return new int[] {circleRadius, circleDiameter};
    }

    public int displaySquareOptions() {
        return Utils.messageAndResponseInt("What is the width?: ");
    }

    public int[] displayTriangleOptions() {
        int triangleWidth = Utils.messageAndResponseInt("What is the width?: ");
        int triangleHeight = Utils.messageAndResponseInt("What is the height: ");
        return new int[] {triangleWidth, triangleHeight};
    }

    public int displayColorOptions() {
        System.out.println("\t\t---COLOR OPTIONS:---");
        System.out.println("1 - Red\n 2 - Magenta\n3 - Blue\n4 - Cyan\n5 - Green");
        return Utils.messageAndResponseInt("Which Color Do You Choose?: ");
    }

    public int displayConfirmation(Shape shape) {
        System.out.println("Is this shape correct?");
        String userShape = "";

        if (shape instanceof Circle) {
            userShape = "Circle";
        } else if (shape instanceof Square) {
            userShape = "Square";
        } else if (shape instanceof Triangle) {
            userShape = "Triangle";
        }
        System.out.printf("\n Shape: %s, Color: %s, Width: %d\n", userShape, shape.color, shape.borderWidth);

        System.out.println("1 - Yes\n2 - No");
        return Utils.messageAndResponseInt("Enter your option: ");
    }
}
