import java.util.Scanner;
public class Assignment1B {
    public static void main(String[] args)
    {
        int weekly_fee,customers,per_week,per_year;
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter the weekly subscription fee: ");
        weekly_fee = user_input.nextInt();
        System.out.print("Enter the number of customers: ");
        customers = user_input.nextInt();

        per_week = weekly_fee * customers;
        per_year = weekly_fee * customers * 52;

        System.out.println("This company makes $" +per_week+ " each week");
        System.out.println("This company makes $" +per_year+ " each year");
    }
}
