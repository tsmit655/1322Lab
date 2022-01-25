/*
Class: CSE 1321L
Section: WJ2
Term: 1st Semester
Instructor: Maneesha Penmetsa
Name: Tracie Smith
Lab#: 1B
*/
import java.util.Scanner;
public class Lab1B {
    public static void main(String[] args)
    {
        String message;
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        message = user_input.nextLine();
        System.out.println("You entered: " +message+ "");
    }
}
