import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String username;
    private String classType;
    final Scanner input = new Scanner(System.in);

    public Player(String username) {
        this.username = username;
    }

    public void selectClass() {
        Samurai samurai = new Samurai();
        Archer archer = new Archer();
        Knight knight = new Knight();

        ClassType[] classList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("-----------------------------");
        System.out.println(this.username + ", first choose your soul:");
        for (ClassType classType : classList) {
            System.out.println(classType.getName() +
                    "\t=>\tDamage: " + classType.getDamage() +
                    "\tHealth: " + classType.getHealth() +
                    "\tMoney: " + classType.getMoney());
        }
        System.out.println("-----------------------------");
        System.out.print("I am exactly a(n) ");
        String classType = input.nextLine();
        switch (classType) {
            case "Samurai":
                initClass(new Samurai());
                break;
            case "Archer":
                initClass(new Archer());
                break;
            case "Knight":
                initClass(new Knight());
                break;
            default:
                System.out.println("Hahaha... It's known as a foreigner. And... We don't like the foreigners.");
        }
        System.out.println("Oh yeah... You're the " + this.classType + " we've been awaiting for years.\n" +
                "Okay, but please \"gnothi seauton\":\n" +
                "You can give " + this.getDamage() + " maximum damage.\n" +
                "You have " + this.getHealth() + " health points FOR NOW *HAHA*.\n" +
                "And I gave you some money. Here's " + this.getMoney() + " Liras! Don't forget this favour.");
    }

    public void initClass(ClassType classType) {
        this.setClassType(classType.getName());
        this.setDamage(classType.getDamage());
        this.setHealth(classType.getHealth());
        this.setMoney(classType.getMoney());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }
}
