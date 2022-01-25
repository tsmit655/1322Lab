import java.util.Scanner;
public class Assignment2B {
    public static void main(String[] args){
        {
            Scanner user_input = new Scanner(System.in);

            System.out.print("Enter the hit box top-left x coordinate: ");
            int topLeftX = user_input.nextInt();
            System.out.print("Enter the hit box top-left y coordinate: ");
            int topLeftY = user_input.nextInt();
            System.out.print("Enter the width of the hit box: ");
            int width = user_input.nextInt();
            System.out.print("Enter the height of the hit box: ");
            int height = user_input.nextInt();
            System.out.println("[Hit Box Coordinates]");
            System.out.println("Top-Left: "+topLeftX+", "+topLeftY);
            System.out.println("Bottom-Left: "+topLeftX+", "+(topLeftY-height));
            System.out.println("Top-Right: "+(topLeftX+width)+", "+topLeftY);
            System.out.println("Bottom-Right: "+(topLeftX+width)+", "+(topLeftY-height));
        }
    }
    }

