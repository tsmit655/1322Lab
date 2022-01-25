import java.util.Scanner;
public class Lab4C {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        double number;
        int response;
        System.out.println("Welcome!");
        System.out.print("Please input a number: ");
        number = user_input.nextDouble();
        System.out.println("What would you like to do to this number: ");
        System.out.println("0- Get the additive inverse of the number");
        System.out.println("1- Get the reciprocal of the number");
        System.out.println("2- Square the number");
        System.out.println("3- Cube the number");
        System.out.println("4- Exit the program");
        response = user_input.nextInt();
        double additive_inverse = number * (-1);
        double reciprocal = 1 / number;
        double square = number * number;
        double cube = number * number * number;

        switch (response) {
            case 0:
                System.out.print("The additive of " + number + " is " +additive_inverse);
                break;
            case 1:
                System.out.print("The reciprocal of " + number + " is " +reciprocal);
                break;
            case 2:
                System.out.print("The square of " +number+ " is " +square);
                break;
            case 3:
                System.out.print("The cube of " +number+ " is " +cube);
                break;
            case 4:
                System.out.print("Thank you, goodbye!");
                break;
            default:
                System.out.print("Invalid input, please try again! ");
        }

    }
}