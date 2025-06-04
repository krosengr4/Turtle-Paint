public class UserInterface {

    public int displayHomeScreen() {
        System.out.println("\t\t---OPTIONS:---");
        System.out.println("1 - Add Shape\n2 - Save Image\n0 - Exit");
        return Utils.messageAndResponseInt("Please Enter Your Option: ");

    }



}
