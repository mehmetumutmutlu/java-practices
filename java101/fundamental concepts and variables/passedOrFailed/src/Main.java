import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int math, physics, chemistry, grammar, history, music;

        System.out.print("Please type your score in Math here: ");
        math = input.nextInt();

        System.out.print("Please type your score in Physics here: ");
        physics = input.nextInt();

        System.out.print("Please type your score in Grammar here: ");
        grammar = input.nextInt();

        System.out.print("Please type your score in Chemistry here: ");
        chemistry = input.nextInt();

        System.out.print("Please type your score in Music here: ");
        music = input.nextInt();

        int total = 0;
        int lecture = 0;

        if (math >= 0 && math <= 100){
            total += math;
            lecture++;
        } else {
            System.out.println("Your Math score wasn't added because you entered an invalid value.");
        }

        if (physics >= 0 && physics <= 100){
            total += physics;
            lecture++;
        } else {
            System.out.println("Your Physics score wasn't added because you entered an invalid value.");
        }

        if (grammar >= 0 && grammar <= 100){
            total += grammar;
            lecture++;
        } else {
            System.out.println("Your Grammar score wasn't added because you entered an invalid value.");
        }

        if (chemistry >= 0 && chemistry <= 100){
            total += chemistry;
            lecture++;
        } else {
            System.out.println("Your Chemistry score wasn't added because you entered an invalid value.");
        }

        if (music >= 0 && music <= 100){
            total += music;
            lecture++;
        } else {
            System.out.println("Your Music score wasn't added because you entered an invalid value.");
        }

        double avg = total / lecture;

        if (avg >= 55) {
            System.out.println("Congrats! You passed.");
        } else {
            System.out.println("Unfortunately! You failed.");
        }

        System.out.println("Your average grade: " + avg);
    }
}