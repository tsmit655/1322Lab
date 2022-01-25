import java.util.Scanner;
public class Assignment1A {
    public static void main(String[] args)
    {
        double Red,Green,Blue,alpha;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a red value (0-255): ");
        Red = scan.nextDouble();
        float new_number1 = (float) (Red / 255);
        System.out.print("Enter a green value(0-255): ");
        Green = scan.nextDouble();
        float new_number2 = (float) (Green / 255);
        System.out.print("Enter a blue value(0-255): ");
        Blue = scan.nextDouble();
        float new_number3 = (float) (Blue / 255);
        System.out.print("Enter a alpha value(0-100): ");
        alpha = scan.nextDouble();
        float new_number4 = (float) (alpha / 100);
        System.out.print("New color is red = "+new_number1+ ", green = "+new_number2+ ", blue = " +new_number3+ ", alpha = " +new_number4+ "");
    }
}
