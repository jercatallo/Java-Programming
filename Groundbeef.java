import java.util.Scanner;

public class  Groundbeef

{
public static void main (String[] args)
{
Double packageGAB;
Double packageBAG;

Scanner scan = new Scanner( System.in );

System.out.println("Price per pound packageGAB: ");
packageGAB = scan.nextDouble();

System.out.println("Percent pound of lean packageGAB: ");
packageGAB = scan.nextDouble();

System.out.println("Price per pound of lean packageBAG: ");
packageBAG = scan.nextDouble();

System.out.println("Price per pound of lean packageBAG: ");
packageBAG = scan.nextDouble();

if (packageGAB < packageBAG){
    System.out.println("\nPackageGAB is the best value");
}
else{
    System.out.println("\nPackageBAG is the best value");
}

int condition;
        if (packageGAB < packageBAG){
            condition = 1;
        }
        else{
            condition = 2;
        }
        
        switch(condition){
            case 1:
                System.out.print("\nPackage GAB is the best value.\n");
                break;
            case 2:
                System.out.print("\nPackage BAG is the best value.\n");
                break;
        }


int a=1, b =2 ,c =3;
if(a < c)
System.out.print("*");
else if(a==b)
System.out.print("&");
else
System.out.print("$");


    }

}