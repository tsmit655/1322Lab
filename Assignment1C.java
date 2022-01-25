import java.util.Scanner;
public class Assignment1C {
    public static void main(String[] args)
    {
        String street,color,food;
        Scanner user_input = new Scanner(System.in);

        System.out.print("Enter the name of the street you live on: ");
        street = user_input.next();
        System.out.print("Enter the name of your favorite color: ");
        color = user_input.next();
        System.out.print("Enter the name of your favorite food: ");
        food = user_input.next();
        System.out.print("Your stage name is " +street+ " " +color+ " "+food+ "");

    }
}
