import java.util.Scanner;
public class LeapYear{
 static final double mile = 1.609;
 static final double gallon = 3.785;
 public static void main(String args[]){
 Scanner myInput =new Scanner(System.in);
 System.out.print("Enter Year: ");
 int year = myInput.nextInt();
 boolean isLeapYear = (year % 4 == 0) && (year % 100 == 0 ? year % 400 == 0:true);

 if (isLeapYear)
 System.out.println(year + " is a leap year.");
 else
 System.out.println(year + " is not a leap year.");
}
}