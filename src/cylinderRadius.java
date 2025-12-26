import java.util.Scanner;

public class cylinderRadius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cylinderRadius;
        double cylinderLength;
        double cylinderVolume;
        double cylinderArea;
        final double PI = 3.1415;
        System.out.print("enter the cylinderRadius: ");
        cylinderRadius = input.nextDouble();
        System.out.print("enter the cylinderLength: ");
        cylinderLength = input.nextDouble();
        cylinderArea = cylinderRadius * cylinderRadius * PI;
        cylinderVolume = cylinderArea * cylinderLength;
        System.out.println("Cylinder Area =" + cylinderArea + " and Cylinder Volume =" + cylinderVolume);

    }
}
