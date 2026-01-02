import java.util.Random;
import java.util.Scanner;

public class Challenge_ThirdLesson {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();


        // Linear Equation
        double a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5, f = 5.9;

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        System.out.println("x = " + x + ", y = " + y);


        // Expression Evaluation
        int x1 = 2, y1 = 1, a1 = 3, b1 = 2, c1 = 1;

        int m = 3 + 4 * x1 / 5
                - 10 * (y1 - 5) * (a1 + b1 + c1) / x1
                + 9 * (4 / x1 + 9 + x1 / y1);

        System.out.println("m = " + m);


        // Math Power
        double rw = 1;
        double result = 5.5 * Math.pow(rw + 2.5, 4.5);
        System.out.println("g = " + result);


        // Post Increment
        int i = 10;
        int newNum = 10 * i++;
        System.out.println("i = " + i + ", newNum = " + newNum);


        // Type Casting
        float ff = 12.5F;
        int ii = (int) ff;
        System.out.println("f = " + ff);
        System.out.println("i = " + ii);


        // Neptune Temperature
        double neptuneTemp = -353;
        double fahrenheit = (neptuneTemp * 9 / 5) + 32;
        System.out.println("Neptune Temp (F): " + fahrenheit);


        // BMI Calculation
        double weight = 68;
        double height = 1.70;
        double bmi = weight / (height * height);
        System.out.println("BMI = " + bmi);


        // Fuel Consumption
        double fuelConsumed = 6.5;
        double distance = 350;
        double totalFuel = (fuelConsumed / 100) * distance;
        System.out.println("Fuel needed = " + totalFuel);


        // Concert Countdown
        int seconds = 10000;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;
        System.out.println(hours + ":" + minutes + ":" + secs);


        // Random Number Digits
        int randomNumber = random.nextInt(1000);
        int sum = randomNumber / 100
                + (randomNumber / 10) % 10
                + randomNumber % 10;

        System.out.println("Random Number: " + randomNumber);
        System.out.println("Sum of digits: " + sum);


        // Sorted Check
        System.out.println("Enter 3 numbers:");
        double p = input.nextDouble();
        double q = input.nextDouble();
        double r = input.nextDouble();
        System.out.println((p < q && q < r) ? "sorted" : "not sorted");


        // Ticket Price
        int age = 4;
        int ticketPrice = (age >= 16) ? 20 : 10;
        System.out.println("Ticket Price = " + ticketPrice);


        // Tax Calculation
        double income = 20000;
        double tax = (income > 100000) ? income * 0.2 : income * 0.17;
        System.out.println("Tax = " + tax);


        // Addition Quiz
        int n1 = random.nextInt(10);
        int n2 = random.nextInt(10);
        int n3 = random.nextInt(10);

        System.out.println("What is " + n1 + " + " + n2 + " + " + n3 + "?");
        int answer = input.nextInt();

        if (answer == n1 + n2 + n3)
            System.out.println("Correct!");
        else
            System.out.println("Wrong!");


        // Even or Odd
        System.out.println("Enter a number:");
        int number = input.nextInt();

        if (number % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        input.close();
    }
}
