import java.util.Scanner;

public class If_Else_Statements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // IF statement
        System.out.print("Enter a score: ");
        double score1 = input.nextDouble();
        double percentageIncrement = 0.03 * score1;

        if (score1 >= 90) {
            System.out.println(score1 + percentageIncrement);
        }

        // IF / ELSE statement
        System.out.print("Enter a score: ");
        double score2 = input.nextDouble();

        double threePercent = 0.03 * score2;
        double onePercent = 0.01 * score2;

        if (score2 >= 90) {
            System.out.println(score2 + threePercent);
        } else {
            System.out.println(score2 + onePercent);
        }

        // Check if number is divisible by 10
        System.out.print("Enter any number: ");
        int number1 = input.nextInt();
        boolean divisibleByTen = number1 % 10 == 0;
        System.out.println(divisibleByTen);

        // Even or multiple of 5
        System.out.print("Enter any number: ");
        int number2 = input.nextInt();

        if (number2 % 2 == 0) {
            System.out.println(number2 + " is even");
        } else if (number2 % 5 == 0) {
            System.out.println(number2 + " is multiple of 5");
        }

        // BMI Calculator
        final double UNDER_WEIGHT = 18.5;
        final double NORMAL_WEIGHT = 25.0;
        final double OVER_WEIGHT = 30.0;

        final double POUND_TO_KG = 0.45359237;
        final double INCH_TO_METER = 0.0254;

        System.out.print("Enter your weight in pounds: ");
        double weightPounds = input.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInches = input.nextDouble();

        double weightKg = weightPounds * POUND_TO_KG;
        double heightMeters = heightInches * INCH_TO_METER;

        double bmi = weightKg / (heightMeters * heightMeters);
        System.out.println("BMI is " + bmi);

        if (bmi < UNDER_WEIGHT) {
            System.out.println("You are underweight, work on it");
        } else if (bmi < NORMAL_WEIGHT) {
            System.out.println("Your weight is normal, great!");
        } else if (bmi < OVER_WEIGHT) {
            System.out.println("You are overweight, work on it");
        } else {
            System.out.println("You are obese!");
        }

        // Age check
        System.out.print("What is your age? ");
        double age = input.nextDouble();

        if (age > 13 && age < 18) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //Weight calculation
        double weight;
        double height;
        System.out.print("What is your weight? ");
        weight = input.nextDouble();
        System.out.print("What is your height? ");
        height = input.nextDouble();
        if (weight > 50 ^ height > 60)
        {
            System.out.println("true");
        } else
        {
            System.out.println("false");
        }


        // Checking if a year is a leap year.

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        // Display the result
        System.out.println(year + " is a leap year? " + isLeapYear);

        // Converting HexDigits to Decimal
        int dec;
        char hexNum;
        String hex;

        System.out.print("Enter a hexadecimal unit: ");
        hex = input.next();
        hex = hex.toUpperCase();
        hexNum = hex.charAt(0);

        if(hex.length() != 1) {
            System.out.print("Pls enter an hexadecimal number");
            return;
        }

        if (hexNum >= '0' && hexNum <= '9') {
            dec =  hexNum - '0';
            System.out.print("The decimal value for your input is " + dec);
        } else if (hexNum >= 'A' && hexNum <= 'F') {
            dec = hexNum - 'A' + 10;
            System.out.print("The decimal digit is " + dec);
        } else {
            System.out.print("There is an error with your input");
        }


        input.close();
    }
}
