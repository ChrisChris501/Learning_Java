
import java.util.Scanner;

public class temperatureCalculations {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = userInput.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.println("Fahrenheit " + fahrenheit + "°F is " + celsius + "°C");

        userInput.close();
    }
}
