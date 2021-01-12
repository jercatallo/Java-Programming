import java.util.Scanner;
public class Quadrant{
 static final double mile = 1.609;
 static final double gallon = 3.785;
 public static void main(String args[]){
 Scanner myInput =new Scanner(System.in);
 System.out.print("Enter Angle of the line: ");
 int angleLine = myInput.nextInt();
 if(angleLine >0 && angleLine < 90){
 System.out.print("Quadrant: I");
 }else if(angleLine >90 && angleLine < 180){
 System.out.print("Quadrant: II");
 }else if(angleLine >180 && angleLine < 270){
 System.out.print("Quadrant: III");
 }else if(angleLine >270 && angleLine < 360){
 System.out.print("Quadrant: IV");
 }else if(angleLine == 0 ||angleLine == 90 ||angleLine == 180 ||angleLine == 270 ){
 System.out.print("The corresponding line does not reside in any quadrant but lies on an axis");
 }else{
 System.out.print("Invalid Angle of the line input");
 }
 }
}