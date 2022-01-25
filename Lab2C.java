/*
Class: CSE 1321L
Section: WJ2
Term: 1st Semester
Instructor: Maneesha Penmetsa
Name: Tracie Smith
Lab#: 2C
*/
import java.util.Scanner;
public class Lab2C {
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        double width,height,area,perimeter;

        System.out.print("Enter a width: ");
        width = user_input.nextDouble();
        System.out.print("Enter a height: ");
        height = user_input.nextDouble();

        area = height * width;
        perimeter = area - height;

        System.out.println("The area is " +area);
        System.out.println("The perimeter is " +perimeter);
    }
}
