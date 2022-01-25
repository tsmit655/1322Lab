/*
Class: CSE 1321L
Section: WJ2
Term: 1st Semester
Instructor: Maneesha Penmetsa
Name: Tracie Smith
Lab#: 2A
*/
import java.util.Scanner;
public class Lab2A {
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        String name2,verb,adverb;
        System.out.print("Enter a name: ");
        String name1 = user_input.next();
        System.out.print("Enter another name: ");
        name2 = user_input.next();
        System.out.print("Enter a verb: ");
        verb = user_input.next();
        System.out.print("Enter an adverb: ");
        adverb = user_input.next();
        System.out.println("Once upon a time, there was a person named \n"
                +name1+ " who had a child named " +name2+ " this child would " +verb+ " \n"
        +adverb+ " while singing to strangers");
    }
}
