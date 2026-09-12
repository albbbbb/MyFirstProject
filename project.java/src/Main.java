import java.util.Scanner;


public class Main{
    public static void main(String[] args){

        //if statements
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("enter your name: ");
        name = scanner.nextLine();

        System.out.print("enter your age: ");
        age = scanner.nextInt();

        System.out.print("are you a student (true/false): ");
        isStudent = scanner.nextBoolean();

        //GROUP 1
        if(name.isEmpty()){
            System.out.println("you didnt enter your name. 😡");

        }
        else{
            System.out.println("hello " + name + "! 😀");
        }

        //GROUP 2
        if(age >= 65){
            System.out.println("youre a senior. ");
        }
        else if(age >= 18){
            System.out.println("you are an adult!");
        }
        else if(age < 0){
            System.out.println("you havent been born yet.");
        }
        else if(age == 0){
            System.out.println("youre a baby. ");
        }
        else{
            System.out.println("you are a child.");
        }

        //GROUP 3
        if(isStudent){
            System.out.println("you are a student. ");
        }
        else{
            System.out.println("you are not a student. ");
        }
    }
}