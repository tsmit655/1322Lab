import java.util.Scanner;
public class Lab3B {
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        float[] hours=new float[4];
        float[] grade=new float[4];
        float total=0,GPA,total_hours=0;

        for(int i=0;i<4;i++)
        {
            System.out.print("Course "+(i+1)+" hours: ");

            hours[i]=user_input.nextFloat();
            System.out.print("Grade for course "+(i+1)+": ");

            grade[i]=user_input.nextFloat();
            total_hours=total_hours+hours[i];
            total=total+(hours[i]*grade[i]);

        }

        GPA=total/total_hours;

        System.out.println("Total hours is: "+total_hours);

        System.out.println("Total quality points is: "+total);

        System.out.println("Your GPA for this semester is "+GPA);

    }

}