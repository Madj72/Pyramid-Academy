import java.util.Scanner;

public class Dragon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "you see two caves. In one cave, the dragon is friendly\n" +
                "and will share his treasure with you. The other dragon\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "Which cave will you go into?(1 or 2)");

        try {
            int userInput = sc.nextInt();
            guessingTheDragon(userInput);
        } catch (Exception exception) {
                exception.getStackTrace();
        }
    }

    public static String guessingTheDragon(int userInput) {


        if (userInput == 1) {
            System.out.print("You approach the cave...\n" +
                    "It is dark and spooky...\n" +
                    "A large gradon jumps out in front of you! He opens his jaws and ...\n" +
                    "Gobbles you down in one bite!");
            return "You approach the cave...\n" +
                    "It is dark and spooky...\n" +
                    "A large gradon jumps out in front of you! He opens his jaws and ...\n" +
                    "Gobbles you down in one bite!";
        } else if (userInput == 2) {
            System.out.println("the dragon wants to say Hi!!");
            return "the dragon wants to say Hi!!";
        } else {
            System.out.println("Please enter a value 1 or 2 !");
            return "Please enter a value 1 or 2 !";
        }
    }
}
