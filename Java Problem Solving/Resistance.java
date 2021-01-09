import java.util.Scanner;

public class Resistance {
    public static void main(String args[]) {
        Scanner myInput =new Scanner(System.in);
        int resistance;
        System.out.print("Enter V in volts: ");
        int inputVoltage = myInput.nextInt();

        System.out.print("Enter I in amperes: ");
        int inputAmperes = myInput.nextInt();


        resistance = inputVoltage / inputAmperes;

        System.out.print("The Resistance R is: " + resistance + " ohms");
    }

}
