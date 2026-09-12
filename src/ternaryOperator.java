import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

//        int score;
//        System.out.print("enter your score: ");
//        score = scanner.nextInt();
//
//        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
//        System.out.println(passOrFail);

//        int number;
//        System.out.println("enter a number of your choice: ");
//        number = scanner.nextInt();
//
//        String evenOrOdd = (number%2==0) ? "even" : "odd";
//        System.out.println(evenOrOdd);

        int hours = 13;
        String timeOfDay = (hours>=12) ? "P.M." : "A.M.";
        System.out.println(timeOfDay);


        scanner.close();
    }
}
