/*
Class: CSE 1321L
Section: WJ2
Term: 1st Semester
Instructor: Maneesha Penmetsa
Name: Tracie Smith
Lab#: 2B
*/
import java.util.Scanner;
public class Lab2B {
    public static void main(String[] args) {
        {
            int n = 7;

            int s = n / 2;

            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < s; j++) {
                    System.out.print("_");
                }

                for (int j = 0; j <= i; j++) {
                    System.out.print("*_");
                }

                for (int j = 0; j < s - 1; j++) {
                    System.out.print("_");
                }

                System.out.println();
                s--;
            }
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();

            s = 1;


            for (int i = n / 2 - 1; i >= 0; i--) {
                for (int j = 0; j < s; j++) {
                    System.out.print("_");
                }

                for (int j = 0; j <= i; j++) {
                    System.out.print("*_");
                }

                for (int j = 0; j < s - 1; j++) {
                    System.out.print("_");
                }

                System.out.println();
                s++;
            }
        }
    }
}
