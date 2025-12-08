import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        double width = 0;
        double height = 0;
        double area = 0;
        Scanner equation = new Scanner(System.in);
        System.out.print("Enter the width: ");
        width = equation.nextDouble();
        System.out.print("Enter the height: ");
        height = equation.nextDouble();

        area = width * height;
        System.out.println("The area of this rectangle is: " + area + "cm^2");
        equation.close();

    }
}
