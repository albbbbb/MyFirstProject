import java.util.Random;
import java.util.Scanner;
public class numberGuessingGame {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;

        int randomNumber = random.nextInt(min, max+1);

        System.out.println("Number Guessing Game!");
        System.out.printf("guess a number between %d - %d\n", min, max);

        do{
            System.out.print("enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("too low! try again");
            }
            else if(guess > randomNumber){
                System.out.println("too high! try again");
            }
            else{
                System.out.println("correct! the number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }

        }while(guess != randomNumber);


        scanner.close();

    }
}
