import java.util.Scanner;

public class weightConversion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int option;

        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choose an option: ");
        option = scanner.nextInt();

        if(option == 1){
            double lbs;
            System.out.print("enter the weight in lbs: ");
            lbs = scanner.nextDouble();
            double weightInKgs = lbs * 0.453592;
            System.out.printf("your weight in kgs is %.2f kgs", weightInKgs);

        }
        else if(option == 2){
            double kgs;
            System.out.print("enter your weight in kgs: ");
            kgs = scanner.nextDouble();
            double weightInLbs = kgs * 2.20462;
            System.out.printf("your weight in lbs is %.2f lbs", weightInLbs);
        }

        else{
            System.out.println("not a valid option");
        }

        scanner.close();
    }
}
