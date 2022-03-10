import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Guessing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello~What is your name?");
        String userName = sc.next();
        System.out.println("Well, " + userName + " I am thinking of a number between 1 and 20.");
        //Number of trials
        int trials = 0;
        //Generating a number between 1 and 20;
        int randomNumber = (int) Math.floor(Math.random() * (20) + 1);
        // the guess will start always with false so we can hit the while loop at least once;
        boolean guessed = false;
        System.out.println("Take a guess.");
        loop(guessed,userName,randomNumber,trials);

    }
    static void loop (boolean guessed, String userName,int randomNumber, int trials){
        while (!guessed) {
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();
            trials++;

            if (randomNumber == userNumber) {
                System.out.println("Good job," + userName + "! You guessed my number in " + trials + " guesses!");

                System.out.println("Would you like to play again? ( y or n )");
                String yesOrNo = scanner.nextLine();
                while(yesOrNo.equals("y")){
                    System.out.println("take another guess, the game is reset.");
                    loop(guessed,userName, ThreadLocalRandom.current().nextInt(1,20), trials);
                }
                guessed = true;

            } else if (userNumber > randomNumber) {
                System.out.println("your guess is too high");
                System.out.println("Take a guess");
            } else{
                System.out.println("your guess is too low.");
                System.out.println("take a guess");
            }

        }
    }

        /*
         Please do not take this code into consideration, I was just trying RECURSION for fun,
         "Recursion is the last solution to think about as per time and space complexity" ==> I know...
          **********Please take a look at the class: GuessingTwo for the solution.**************
         */
}