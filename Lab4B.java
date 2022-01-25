import java.util.Scanner;
public class Lab4B {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String day_name;
        System.out.print("Enter the day: ");
        day_name = user_input.next();
        day_name = day_name.toLowerCase();
        switch (day_name) {
            case "monday":
            case "wednesday":
                System.out.print("I have class today!");
                break;
            case "friday":
                System.out.print("It's Friday! Friday! Gotta get down on Friday!");
                break;
            case "tuesday":
            case "thursday":
            case "saturday":
            case "sunday":
                System.out.print("I should use this time to do my homework.");
                break;

        }
    }
}
