import java.util.Scanner;

public class math {
    public static void main(String[] args){

        // System.out.println(Math.PI);
        // System.out.println(Math.E);
//
//        double result;
//
//        result= Math.pow(2, 5);
//        result = Math.abs(-5);
//        result = Math.sqrt(9);
//        result = Math.round(3.14);
//        result = Math.ceil(3.14);
//        result = Math.floor(3.99);
//        result = Math.max(10, 20);
//        result = Math.min(10, 13);
//        System.out.println(result);

        // hypotenuse
        Scanner scanner = new Scanner(System.in);

//        double a;
//        double b;
//        double c;
//
//        System.out.print("enter length of side a: ");
//        a = scanner.nextDouble();
//
//        System.out.print("enter side of side b: ");
//        b = scanner.nextDouble();
//
//        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//        System.out.println("the hypotenuse is: " + c + "cm.");

        double radius;
        double circumference;
        double area;
        double volume;


        System.out.println("enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("the circumference is: %.1fcm\n", circumference);
        System.out.printf("the area is: %.1fcm²\n", area);
        System.out.printf("the volume is: %.1fcm^3\n", volume);


        scanner.close();
    }
}
