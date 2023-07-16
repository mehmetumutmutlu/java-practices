import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int math, physics, chemistry, grammar, history, music;

        System.out.print("Please type your score in Math here: ");
        math = input.nextInt();

        System.out.print("Please type your score in Physics here: ");
        physics = input.nextInt();

        System.out.print("Please type your score in Chemistry here: ");
        chemistry = input.nextInt();

        System.out.print("Please type your score in Grammar here: ");
        grammar = input.nextInt();

        System.out.print("Please type your score in History here: ");
        history = input.nextInt();

        System.out.print("Please type your score in Music here: ");
        music = input.nextInt();

        int total = (math + physics + chemistry + grammar + history + music);
        double avg = total / 6.0;

        System.out.println("Your average grade: " + avg);
        System.out.println(avg > 60 ? "Passed" : "Failed");
    }
}
