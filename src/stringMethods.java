import java.util.Locale;
import java.util.Scanner;

public class stringMethods {
    public static void main(String[] args){

        /*
        String name = "Alba Ballhysa";


        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("h");
        int lastIndex = name.lastIndexOf("a");

        //name = name.toUpperCase();
        //name = name.toLowerCase();

        // name = name.trim(); trims the whitespace

        //name = name.replace("a", "o");

        //System.out.println(name);

        if(name.isEmpty()){
            System.out.println("your name is empty.");
        }
        else{
            System.out.println("hello " + name);
        }


        if(name.contains(" ")){
            System.out.println("your name contains a space");
        }
        else{
            System.out.println("your name doesnt contain any spaces");
        }



        if(name.equalsIgnoreCase("password")){
            System.out.println("your name cant be password");
        }
        else{
            System.out.println("hello " + name);
        }
        */

        Scanner scanner = new Scanner(System.in);

        String email;
        System.out.print("enter your email: ");
        email = scanner.nextLine();




        if(email.contains("@")){
            System.out.println("valid email");

            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("email must contain @");
        }

        scanner.close();
    }
}
