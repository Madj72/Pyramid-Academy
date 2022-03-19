import java.util.*;

public class Hangman {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String word;
        List<String> words = new ArrayList<>();
        words.add("java");
        words.add("genspark");
        words.add("programming");
        words.add("spring");
        words.add("hack");


        Random rand = new Random();
        word = words.get(rand.nextInt(words.size()));

        List<Character> playerGuesses = new ArrayList<>();

        Integer wrongCount = 0;
        try {
            loopOver(keyboard, word, playerGuesses, wrongCount);
            System.out.println("Do you want to play again ? Y or N ");
            String yOrN = keyboard.nextLine();
            if(yOrN.equals("Y")){
                loopOver(keyboard, word, playerGuesses, wrongCount);
            }else{
                System.out.println("See you next time!");
            }
        } catch (Exception exception) {
            exception.getStackTrace();
        }
    }

    public static String loopOver(Scanner keyboard, String word, List<Character> playerGuesses, Integer wrongCount) {
        while (true) {
            printHangedMan(wrongCount);

            if (wrongCount >= 4) {
                System.out.println("You lost!");
                System.out.println("The word was: " + word);
                break;
            }


            printWordState(word, playerGuesses);
            if (!getPlayerGuess(keyboard, word, playerGuesses)) {
                wrongCount++;
            }

            if (printWordState(word, playerGuesses)) {
                System.out.println("You win!");
                System.out.println("Do you want to play again ? Y or N ");
                String yOrN = keyboard.nextLine();
                break;
            }
        }
        return "";
    }

    public static int printHangedMan(Integer wrongCount) throws RuntimeException {
        System.out.println(" +---+");
        System.out.println(" |   |");
        if (wrongCount >= 1) {
            System.out.println(" O");
        }

        if (wrongCount >= 2) {
            if (wrongCount >= 3) {
                System.out.println("/|\\");
            } else {
                System.out.println("");
            }
        }
        if (wrongCount >= 4) {
            System.out.println(" |");
            System.out.println("/ \\");
        }
        return 10;
    }

    private static boolean getPlayerGuess(Scanner keyboard, String word, List<Character> playerGuesses) throws InputMismatchException {
        System.out.println("Please enter a letter:");
        String letterGuess = keyboard.nextLine();

        if (playerGuesses.contains(letterGuess.charAt(0))) {
            System.out.println("You already put this letter, try another one!");
        }

        playerGuesses.add(letterGuess.charAt(0));
        return word.contains(letterGuess);

    }

    public static boolean printWordState(String word, List<Character> playerGuesses) {
        int correctCount = 0;
        try {
            for (int i = 0; i < word.length(); i++) {
                if (playerGuesses.contains(word.charAt(i))) {
                    System.out.print(word.charAt(i));
                    correctCount++;
                } else {
                    System.out.print("-");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();

        return (word.length() == correctCount);
    }
}
