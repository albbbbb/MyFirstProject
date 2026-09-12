import java.util.Scanner;

public class forLoops {
    public static void main(String[] args) {
        /*
        for(int i = 0;i < 10; i++){
            System.out.println(i);
            }

         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 1; i <= max; i++){
            System.out.println(i);
        }

    }
}
