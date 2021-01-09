import java.util.Scanner;

public class Perimeter {
    public static void main(String args[])  {
        Scanner myInput =new Scanner(System.in);
        int area,perimeter;
        System.out.print("Enter length: ");
        int length = myInput.nextInt();

        System.out.print("Enter width: ");
        int width = myInput.nextInt();


        perimeter = (2*length) + (2*width);
        area =length * width;

        System.out.println("Area = " +area);
        System.out.print("Perimeter = " +perimeter);
    }

}
