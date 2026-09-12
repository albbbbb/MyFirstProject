import java.util.Scanner;

public class nestedConditions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean isStudent;
        boolean isSenior;
        double price = 9.99;

        System.out.println("are you a student? (true/false)");
        isStudent = scanner.nextBoolean();
        System.out.println("are you a senior? (true/false)");
        isSenior = scanner.nextBoolean();

        if(isStudent){
            if(isSenior){
                System.out.println("you get a senior discount of 20% and a student discount of 10%");
                price *= 0.7;
            }
            else{
                System.out.println("you get a student discount of 10%");
                price *= 0.9;
            }

        }
        else{
            if(isSenior){
                System.out.println("you get a senior discount of 20%");
                price *= 0.8;
            }
            else{
                price *= 1;
            }
        }

        System.out.printf("the price of a ticket is $%.2f", price);

        scanner.close();
    }
}
