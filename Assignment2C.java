import java.util.Scanner;
public class Assignment2C {
    public static void main(String[] args){

            Scanner user_input = new Scanner(System.in);
            System.out.println("Welcome to Bisonica!");
            System.out.print("How many US Dollars do you have? ");
            int dollar = user_input.nextInt();
            double british_pound = dollar * 0.73;
            double british_dollar = british_pound / 5.0;
            System.out.println(dollar+" US Dollar(s) is "+british_pound+" British Pound(s), \n" +
                    "which is "+british_dollar+" Bison Dollar(s)!");
        }
    }

