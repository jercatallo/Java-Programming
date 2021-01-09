import java.io.*;

public class Circle {
    static final double PI = 3.141592653589793238;
    public static void main(String args[]) throws IOException {
        BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));
        String inputRadius;   int radius;   double area;
     
        System.out.print("Input the radius: ");
        inputRadius = myInput.readLine();
        radius = Integer.parseInt(inputRadius);

        System.out.println("The Radius is: " + radius);
        area = PI * (Math.pow(radius, 2));

        System.out.println("The Radius area is: " + area);
    }
}