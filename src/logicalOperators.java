import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*
        double temp;
        boolean isSunny = false;


        System.out.print("enter the temperature: ");
        temp = scanner.nextDouble();


        if(temp <= 30 && temp>= 0 && isSunny){   //with the AND operator both should be true
            System.out.println("the weather is good!");
            System.out.println("its sunny outside");
        }
        else if(temp <= 30 && temp>= 0 && !isSunny){  // ! = NOT
            System.out.println("the weather is good!");
            System.out.println("its clody");
        }

        else if(temp > 30 || temp < 0){
            System.out.println("the weather is bad"); // || = OR only one condition needs to be true
        }

         */

        // username between 4-12 characters
        // must not contain spaces or underscores

        String username;

        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if((username.length() < 4 || username.length() > 12) && (username.contains(" ") ||  username.contains("_"))){
            System.out.println("username must be between 4-12 characters.");
            System.out.println("username must not contain spaces or underscores.");
        }
        else if(username.length() < 4 || username.length() > 12){
            System.out.println("username must be between 4-12 characters.");
        }
        else if(username.contains(" ") ||  username.contains("_")){
            System.out.println("username must not contain spaces or underscores.");
        }
        else{
            System.out.println("welcome " + username + "!");
        }



    }
}
