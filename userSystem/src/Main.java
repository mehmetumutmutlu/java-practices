import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String username = "patika";
        String password = "java123";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String usernameGiven = input.nextLine();

        System.out.print("Enter your password: ");
        String passwordGiven = input.nextLine();

        if (usernameGiven.equals(username) && passwordGiven.equals(password)) {
            System.out.println("Logged in successfully!");
        } else {
            System.out.println("You couldn't log in.");
            System.out.print("Do you want to reset your password? [y/n]: ");
            String answer = input.nextLine();
            switch (answer) {
                case "y":
                    System.out.print("Enter your new password (it should be different from the old one): ");
                    String passwordNew = input.nextLine();
                    if (passwordNew.equals(passwordNew)) {
                        System.out.println("Error! You entered the old password.");
                    } else {
                        passwordGiven = passwordNew;
                        System.out.println("Your password has been changed successfully.");
                    }
                    break;
                case "n":
                    System.out.println("You couldn't log in.");
                    break;
                default:
            }
        }
    }
}
