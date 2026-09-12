


import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("what item would you like to buy? ");
        item = scanner.nextLine();
        System.out.print("what is the price for each? ");
        price = scanner.nextDouble();
        System.out.print("how many would you like? ");
        quantity = scanner.nextInt();
        total = quantity * price;

        System.out.print(quantity+ " " + item + "/s" + " cost " + currency + total);


        scanner.close();
    }
}