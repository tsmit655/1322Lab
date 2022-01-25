import java.util.Scanner;
public class Assignment2A {
    public static void main(String[] args){

                int seconds;

                Scanner user_input = new Scanner(System.in);

                System.out.print("How much time has passed (in seconds)?: ");

        seconds= user_input.nextInt();

                int total=seconds;

                System.out.println("Now Converting...");

                int hour = seconds/3600;

        seconds = seconds % 3600;

                int min= seconds/60;

        seconds = seconds % 60;

                System.out.println(total+" seconds is "+hour+" hour(s), "+min+" minute(s), and "+seconds+" second(s).");

            }

        }
