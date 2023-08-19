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

        while (true) {
            Map map = null;
            System.out.println("###### AREAS #######");
            System.out.println("1. Safe House");
            System.out.println("2. Tool Store");
            System.out.print("Where do you want? ");
            String goTo = input.nextLine();
            switch (goTo) {
                case "Safe House":
                    map = new SafeHouse(player);
                    break;
                case "Tool Store":
                    map = new ToolStore(player);
                    break;
                default:
                    System.out.println("I don't suggest it.");
            }
            if (!map.onMap()) {
                System.out.println("You died! GAME OVER!!!");
                break;
            }
        }
    }
}
