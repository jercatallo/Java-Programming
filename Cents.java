import java.io.*;

public class Cents {
    public static void main(String args[]) throws IOException {
        BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));
        String inputCents;    int cents, centsRemain,dollars;
    
        System.out.print("Input the Cents: ");
        inputCents = myInput.readLine();
        cents = Integer.parseInt(inputCents);
        dollars = cents / 100;
        centsRemain = cents % 100;

        System.out.println("Thats is " + dollars + " dollars and " + centsRemain + " cents.");
    }
}
