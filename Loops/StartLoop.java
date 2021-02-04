import java.util.Scanner;
public class StartLoop {

    public static void main (String args[]){
        int sum=0;

        Scanner input= new Scanner (System.in);
        System.out.println("Enter Start: "); int start=input.nextInt();
        System.out.println("Enter End: "); int end=input.nextInt();
        System.out.print("\n");
        do{
            System.out.println(start);
            sum += start;
            start++;

        }while(start<=end);
        System.out.print("Sum of in range values: " + sum);
    }

}
