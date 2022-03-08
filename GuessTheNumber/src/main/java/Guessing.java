import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello~What is your name?");
        String userName = sc.next();
        System.out.println("Well, "+userName+ " I am thinking of a number between 1 and 20.");
        System.out.println("Take a guess.");
        int number = sc.nextInt();

    }
}
