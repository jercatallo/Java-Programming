import java.util.Scanner;

public class SumAndProduct {
    public static void main(String args[]) {
        Scanner myInput =new Scanner(System.in);
        int sum,product;
        System.out.print("Enter your first number: ");
        int num1 = myInput.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = myInput.nextInt();
        System.out.print("Enter your third number: ");
        int num3 = myInput.nextInt();
        System.out.print("Enter your fourth number: ");
        int num4 = myInput.nextInt();
        System.out.print("Enter your fifth number: ");
        int num5 = myInput.nextInt();

        sum = num1 + num2 + num3+ num4 +num5;
        product = num1 * num2 * num3 * num4 *num5;

        System.out.println("Sum = " + sum);
        System.out.print("Product = " +product);
      
    }
    
}
