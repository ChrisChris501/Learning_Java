
import java.util.Scanner;

public class temperatureCalculations {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = userInput.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.println("Fahrenheit " + fahrenheit + "°F is " + celsius + "°C");

        userInput.close();


        //Temperature : Hot Coffee

        double pouredCoffeeTemp = 85;
        double recommendedTemp = 140;

        //Convert coffee temp from degree Celsius to Fahrenheit
        pouredCoffeeTemp = (pouredCoffeeTemp * 9/5) + 32;
        System.out.println("Converted coffee Temp is " + pouredCoffeeTemp + "degree Fahrenheit");
        //Check if Coffee Temp is hotter than the recommended recipe
        if (pouredCoffeeTemp > recommendedTemp) {
            System.out.println("Coffee is hotter than the recommended temperature");
        } else {
            System.out.println("Coffee is the recommended temp");
        }


      //  Cold Winter Day
        double munichWeather = -4;
        double munichWeatherToFahrenheit = (munichWeather * 9 / 5) + 32;
        System.out.println(munichWeatherToFahrenheit);
    }
}
