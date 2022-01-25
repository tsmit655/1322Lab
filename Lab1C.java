/*
Class: CSE 1321L
Section: WJ2
Term: 1st Semester
Instructor: Maneesha Penmetsa
Name: Tracie Smith
Lab#: 1C
*/
import java.util.Scanner;
public class Lab1C {
    public static void main(String[] args)
    {
        int miles;
        double gallons, mpg;
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter the number of miles: ");
        miles = user_input.nextInt();

        System.out.print("Enter the gallons of fuel used: ");
        gallons = user_input.nextDouble();

        mpg = miles / gallons;
        System.out.println("Miles Per Gallon: " + mpg);

    }
}
