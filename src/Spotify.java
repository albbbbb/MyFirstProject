import java.util.Scanner;


public class Spotify {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String answer;

        System.out.println("Hi there! Are you ready to answer some questions and find out your perfect song of the moment?");
        System.out.println("I am just going to need a Yes or No answer! ");
        answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("Yes")){
            System.out.println("Great! Let's start! ");
        }
        else{
            System.out.println("Okay then🙁. Have a nice day! ");
            System.exit(0);
        }

        String name;
        int numbers;
        System.out.println("Let us start with the basics. What is your name?");
        name = scanner.nextLine();
        System.out.println("Nice to meet you " + name + "! I would kindly ask you to press 1 is you're feeling nostalgic/melancholic of something or someone; 2 if you're very happy and at peace; 3 if you're just confused throughout; 4 if you're sad or 5 if you want a surprise song.");
        numbers = scanner.nextInt();

        if(numbers == 1){
            System.out.println("I think you would really enjoy *song* right now. *link*");
        }
        else if(numbers == 2){
            System.out.println("I think you would really enjoy *song* right now. *link*");
        }
        else if(numbers == 3){
            System.out.println("I think you would really enjoy *song* right now. *link*");
        }
        else if(numbers == 4){
            System.out.println("I think you would really enjoy *song* right now. *link*");
        }
        else{
            System.out.println("I think you would really enjoy *song* right now. *link*");
        }

        scanner.close();
    }
}
