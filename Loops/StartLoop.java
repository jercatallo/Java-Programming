import java.util.Scanner;
public class StartLoop {
//     1. Write a program that asks the user for a starting value and an ending
// value and then writes all the integers (inclusive) between those two values.
// Enter Start:
// 10
// Enter End:
// 15
    public static void main (String args[]){
        int sum=0;

        Scanner sc= new Scanner (System.in);
        System.out.println("Enter Start: "); int start=sc.nextInt();
        System.out.println("Enter End: "); int end=sc.nextInt();
        System.out.print("\n");
        do{
            System.out.println(start);
            sum += start;
            start++;

        }while(start<=end);
        System.out.print("Sum of in range values: " + sum);
    }

}
