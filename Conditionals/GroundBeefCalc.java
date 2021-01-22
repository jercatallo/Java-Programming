import java.util.Scanner;
public class GroundBeefCalc {
    public static void main(String args[]){
        Scanner myInput =new Scanner(System.in);

        String bestValue = ""; 
        double pricePerPoundOfLeanA,pricePerPoundOfLeanB;
       
        System.out.println("The price per pound of package A: ");
        double pricePerPoundA = myInput.nextDouble();
        System.out.println("Percent lean package A: ");
        double percentLeanA = myInput.nextDouble();
        System.out.println("The price per pound of package B: ");
        double pricePerPoundB = myInput.nextDouble();
        System.out.println("Percent lean package B: ");
        double percentLeanB = myInput.nextDouble();
        pricePerPoundOfLeanA = pricePerPoundA / percentLeanA * 100;
        pricePerPoundOfLeanB = pricePerPoundB / percentLeanB * 100;

        if(pricePerPoundOfLeanA <pricePerPoundOfLeanB){
             bestValue = "Package A";
        }else if(pricePerPoundOfLeanB<pricePerPoundOfLeanA){
            bestValue = "Package B";
        }else if(pricePerPoundOfLeanA == pricePerPoundOfLeanB){
            bestValue = "Same Price";
        }

        System.out.printf("Package A cost per pound of lean: %.2f %n",pricePerPoundOfLeanA);
        System.out.printf("Package B cost per pound of lean: %.2f %n",pricePerPoundOfLeanB);

        switch(bestValue){
            case "Package A":
            System.out.println("Package A is the best value");
            break;
            case "Package B":
            System.out.println("Package B is the best value");
            break;    
            case "Same Price":
            System.out.println("Package A and Package B had the same price");
            break;
        }
       
       }
}
