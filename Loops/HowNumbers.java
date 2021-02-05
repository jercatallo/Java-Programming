import java.util.Scanner;
public class HowNumbers {

    public static void main (String args[]){
        int i,sum=0,numbers;
        Scanner input= new Scanner (System.in);
        System.out.println("How many numbers will you enter?"); i=input.nextInt();
        System.out.println("Enter "+ i + " integers one per line:");

        do{
            numbers=input.nextInt();
            sum+=numbers;
            i--;
        }while(i!=0);
        System.out.print("The sum is " + sum);
    }
}