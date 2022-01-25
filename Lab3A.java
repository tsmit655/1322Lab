import java.util.Scanner;
public class Lab3A {
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        float owed,APR,Monthly_Percentage,Minimum_Payment;
        System.out.print("Amount owed: $");
        owed = user_input.nextFloat();
        System.out.print("APR: ");
        APR = user_input.nextFloat();

        Monthly_Percentage = (APR / 12);
        Minimum_Payment = (owed * APR / 12 /100);

        System.out.println("Monthly percentage rate: " +Monthly_Percentage );
        System.out.println("Minimum Payment: $" +Minimum_Payment);
    }
}
