import java.util.Scanner;


public class whileLoops {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        /*
        String name = "";

        while(name.isEmpty()){
            System.out.print("enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);




        String response ="";

        while(!response.equalsIgnoreCase("Q")){
            System.out.println("you are playing a game");
            System.out.println("press Q to quit");
            response = scanner.next();
        }

        System.out.println("you have quit the game");



        int age = 0;

        do{
            System.out.println("your age cant be negative");
            System.out.println("enter your age: ");
            age = scanner.nextInt();

        }while(age < 0);


         */

        int number = 0;

        do{
            System.out.print("enter a number from 1-10: ");
            number = scanner.nextInt();

        }while((number < 1 || number > 10));

        System.out.println("you picked " + number);

        scanner.close();
    }
}
