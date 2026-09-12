import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double n1;
        double n2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("enter the first number: ");
        n1 = scanner.nextDouble();

        System.out.print("enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("enter the second number: ");
        n2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = n1 + n2;
            case '-' -> result = n1 - n2;
            case '*' -> result = n1 * n2;
            case '/' -> {
                if(n2 == 0){
                    System.out.println("can not divide by 0!");
                    validOperation = false;
                }
                else{
                    result = n1/n2;
                }
            }
            case '^' -> result = Math.pow(n1, n2);
            default -> {
                System.out.println("invalid operator");
                validOperation = false;
            }
        }
        if(validOperation){
            System.out.println(result);
        }


        scanner.close();

    }
}
