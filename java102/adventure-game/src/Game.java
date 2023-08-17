import java.util.Scanner;

public class Game {
    final Scanner input = new Scanner(System.in);
    public void start() {
        System.out.println("Welcome to the ISSIZ ADA!");

        System.out.print("What's your name? ");
        String username = input.nextLine();
        Player player = new Player(username);
        System.out.println("Wow! I see " + player.getUsername() + " has landed to the island...");
        player.selectClass();
    }
}
