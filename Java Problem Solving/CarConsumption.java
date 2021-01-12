import java.util.Scanner;
public class CarConsumption{
 static final double mile = 1.609;
 static final double gallon = 3.785;
 public static void main(String args[]){
 Scanner myInput =new Scanner(System.in);
 System.out.println("PREFERRED CONVERSION: ");
 System.out.println("1. kpl to mpg ");
 System.out.println("2. mpg to kpl");
 System.out.print("Enter your choice:");
 int choice = myInput.nextInt();

 switch(choice){
 case 1:
 System.out.print("Enter kilometers per liter value: ");
 double kplValue =myInput.nextDouble();
 double mplConverted = ((kplValue / mile) * gallon);
 System.out.printf("The equivalent miles per gallon is: %.2f",mplConverted);
 break;
 case 2:
 System.out.print("Enter miles per gallon value: ");
 double mpgValue =myInput.nextDouble();
 double kplConverted =((mpgValue * mile ) / gallon);
 System.out.printf("The equivalent kilometers per liter is: %.2f",kplConverted);
 break;
 default:
 }

 }
}