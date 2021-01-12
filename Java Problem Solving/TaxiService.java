import java.util.Scanner;
public class TaxiService{
 static final double mile = 1.609;
 static final double gallon = 3.785;
 public static void main(String args[]){
 Scanner myInput =new Scanner(System.in);
 Scanner textScan = new Scanner(System.in);
 System.out.print("Enter Type of Taxy: ");
 String typeOfTaxy = textScan.nextLine().toLowerCase();
 if(typeOfTaxy.equals("micro") ||typeOfTaxy.equals("macro") ||typeOfTaxy.equals("shared")){
 System.out.print("Enter Distance Travelled in killometers: ");
 double distanceTravelled = myInput.nextDouble();
 if(typeOfTaxy.equals("micro") ){
 System.out.printf("Total Fare: %.2f", (15.00 * distanceTravelled));
 }else if(typeOfTaxy.equals("macro")){
 System.out.printf("Total Fare: %.2f", (35.50 * distanceTravelled));
 }else if(typeOfTaxy.equals("shared")){
 System.out.printf("Total Fare: %.2f", (8.50 * distanceTravelled));
 }
 }else{
 System.out.print("Invalid type of taxy ");
 }
 }
}