import java.util.Scanner;
public class Lab4A {
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        float exam_score;
        System.out.print("Enter the score of your exam: ");
        exam_score = user_input.nextFloat();
        System.out.print("Letter grade is: ");

        if(exam_score >=89 && exam_score<= 100)
        {
            System.out.print("A+");

        }
        else if(exam_score >=95 && exam_score <= 97)
        {
            System.out.print("A");
        }

        if(exam_score >= 92 && exam_score <= 94)
        {
            System.out.print("A-");
        }
        else if(exam_score >=89 && exam_score <= 91)
        {
           System.out.print("B+");
        }
        if(exam_score >= 86 && exam_score <= 88)
        {
            System.out.print("B");
        }
        else if(exam_score >= 83 && exam_score <= 85)
        {
            System.out.print("B-");
        }
        if (exam_score >= 80 && exam_score <= 82)
        {
          System.out.print("C+");
        }
        else if(exam_score >= 77 && exam_score <= 79)
        {
            System.out.print("C");
        }
        if (exam_score >= 74 && exam_score <= 76)
        {
            System.out.print("C-");
        }
        else if(exam_score >= 71 && exam_score <= 73)
        {
            System.out.print("D+");
        }
        if(exam_score >= 68 && exam_score <= 70)
        {
            System.out.print("D");
        }
        else if(exam_score >= 65 && exam_score <= 67)
        {
            System.out.print("D-");
        }
        if(exam_score >= 0 && exam_score <= 64)
            System.out.print("F");
    }
}
