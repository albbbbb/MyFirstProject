import java.util.Scanner;

public class enhancedSwitch {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String day;
        System.out.print("enter the day of the week: ");
        day = scanner.nextLine();


        switch(day.toLowerCase()){
            case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                    System.out.println("its a weekday");
            case "saturday", "sunday" ->
                    System.out.println("its the weekend");
            default -> System.out.println(day + " is not a day");


        }
    }
}
