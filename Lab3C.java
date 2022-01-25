import java.util.Scanner;
public class Lab3C {
    public static void main(String[]args){
        Scanner user_input = new Scanner(System.in);

        int quarters,dimes,nickels,pennies;
        System.out.print("Enter the number of quarters: ");
        quarters = user_input.nextInt();
        System.out.print("Enter the number of dimes: ");
        dimes = user_input.nextInt();
        System.out.print("Enter the number of nickels: ");
        nickels = user_input.nextInt();
        System.out.print("Enter the number of pennies: ");
        pennies = user_input.nextInt();
        int dollars,cents;
        cents = quarters * 25 + dimes * 10 + nickels * 5 + pennies;
                dollars = cents / 100;
        cents %=100;
        System.out.println();
        System.out.println("You entered " +quarters+ " quarters.");
        System.out.println("You entered " +dimes+ " dimes.");
        System.out.println("You entered " +nickels+ " nickels.");
        System.out.println("You entered " +pennies+ " pennies.");
        System.out.println();
        System.out.println("Your total is " +dollars+ " dollars and " +cents+ " cents" );
    }
}
