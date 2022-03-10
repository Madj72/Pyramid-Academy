import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello~What is your name?");
        String userName = sc.next();
        gameloop(userName ,sc);

        try{
        while(doYouWannaPlayAgain()){
            Scanner scanner = new Scanner(System.in);
            gameloop(userName ,scanner);
        }}catch(Exception e){
            e.printStackTrace();
        }
    }
    public static boolean guessedLoop(int userInput, int randomNumber){
        if(randomNumber < userInput){
            System.out.println("your guess is too high \n  Take a guess");
            return false;
        }else if(randomNumber > userInput) {
            System.out.println("your guess is too low \n  Take a guess");
            return false;
        }
        return false;
    }

    public static boolean winner (String userName, int trials){
            System.out.println("Good job," + userName + "! You guessed my number in " + trials + " guesses!");
            return true;
    }
    public static void gameloop(String userName, Scanner sc){

        System.out.println("Well, " + userName + " I am thinking of a number between 1 and 20.\nTake a guess.");
        int random = ThreadLocalRandom.current().nextInt(1,20);
        int userInput = sc.nextInt();
        int trials = 1;
        try{
        do{
            guessedLoop(userInput, random);
            userInput = sc.nextInt();
            trials++;
        }while (userInput != random);}
        catch (Exception e){
            e.printStackTrace();
        }

        winner(userName,trials);
    }
    public static boolean doYouWannaPlayAgain(){
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();
        System.out.println("Do you want to play again? please type `Y` for yes and `N` for No.");
        if(userAnswer.equals("Y")) return true;
        else{return false;}
    }

}
