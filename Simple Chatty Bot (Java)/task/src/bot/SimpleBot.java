package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {

        greeting();
        askName();
        guessAge();

    }

    public static void greeting() {
        System.out.println("Hello! My name is ByteBuddy.");
        System.out.println("I was created in 2023.");
    }

    public static void askName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, remind me your name.");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    public static void guessAge() {
        Scanner scanner = new Scanner(System.in);
        int remainderBy3, remainderBy5, remainderBy7;
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        remainderBy3 = scanner.nextInt();
        remainderBy5 = scanner.nextInt();
        remainderBy7 = scanner.nextInt();

        int age = (remainderBy3 * 70 + remainderBy5 * 21 + remainderBy7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }
}
