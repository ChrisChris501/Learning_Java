
import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
       /*
       double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;
        double x;
        double y;

        x = (e * d - b * f)/(a * d - b * c);
        y = (a * f - e * c) / (a * d - b * c);
        System.out.println("x is equals " + x + " and y is equals " + y);
        double miles = 100;
        final double KILOMETERS_PER_MILE = 1.609;
        double kilometers = miles * KILOMETERS_PER_MILE;
        System.out.println(kilometers);
        System.out.println (Math.pow(2, 3.5));



        int x = 2;
        int y = 1;
        int a = 3;
        int b = 2;
        int c = 1;
        int m = 3 + 4*(x) / 5 - 10*(y - 5) * (a + b + c) / x + 9 * (4/x + 9 + x / y);
        int r;
        System.out.println (m);



        double width = 0;
        double height = 0;
        double area = 0;
        Scanner equation = new Scanner(System.in);
        System.out.print("Enter the width: ");
        width = equation.nextDouble();
        System.out.print("Enter the height: ");
        height = equation.nextDouble();

        area = width * height;
        System.out.println("The area is: " + area + "cm^2");
        equation.close();

        double Fahrenheit = 0;
        double Celsius = 0;
        Scanner userInput =  new Scanner (System.in);

        System.out.print("enter a degree Fahrenheit: ");
        Fahrenheit = userInput.nextDouble();

        celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.print("Fahrenheit " + Fahrenheit + " is " + Celsius + " in Celsius");

        double a = 2;
        double b = 2;
        double c = 1;
        double d = 3;
        double r = 1;
        double f = 2;
        double t = 2;
        double g;
        f = 4 / (3 * ( r + 34 )) - 9 * (a + b*(c)) + ( 3 + d * (2 + a)) / a + b*(d);
        g = 5.5 * Math.pow(r + 2.5, 2.5 + t);
        System.out.print("g is equals " + g);

        //Current time display
        long totalMilliseconds = System.currentTimeMillis();
        System.out.println("totalMilli is " + totalMilliseconds);

        long totalSeconds = totalMilliseconds / 1000;
        System.out.println("totalSec is " + totalSeconds);

        long currentSeconds = totalSeconds % 60 ;
        System.out.println("currentSecs is " + currentSeconds);

        long totalMinutes = totalSeconds / 60;
         System.out.println("totalMin is " + totalMinutes);

        long currentMinutes = totalMinutes % 60;
        System.out.println("currentMin " + currentMinutes);

        long totalHours = totalMinutes / 60;
        System.out.println("totalMins is " + totalMinutes);

        long currentHour = totalHours % 24 ;
        System.out.println("Current time is " + currentHour + "hour " + currentMinutes + "mins " + currentSeconds + "secs " + "GMT");
        int i = 10;
        int newNum = 10 * i++;
        System.out.print("i is " + i
                + ", newNum is " + newNum
        float f = 12.5F;
        int i = (int)f;
        System.out.println("f is " + f);
        System.out.println("i is " + i);


        double amount = 5;
        System.out.println(amount / 2);
        System.out.println(5 / 2);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the annual interest rate (percentage): ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterest = annualInterestRate/1200;

        System.out.print("Enter the number of years to pay laon: ");
        double numberOfYears = input.nextDouble();

        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();


        double monthlyPayment = loanAmount * monthlyInterest / (1 - 1 / Math.pow (1 + monthlyInterest, numberOfYears * 12)) ;
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("monthly payment is equals: #" + (int)(monthlyPayment * 100)/100.0);
        System.out.println("Total payment is equals: #" + (int)(totalPayment * 100)/100.0);

        double r = (-b + Math.sqrt (Math.pow(b, 2) - 4 * a * c)) / 2 * a;


        (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
        seconds. Write a program that displays the average speed in miles per hour. (Note
                                                                                             that 1 mile is 1.6 kilometers.)

                -> speed = distance / time; // Formula
        "Speed of athlete is (speed) miles/hr"; // Output

        double distance;
        double time;
        double speed;
        double speedInMiles = 24;

        //Time to hours
        time = ((60 * 60) + (40.0 * 60) + 35) / 3600;
        System.out.println(time);

        //Speed to kilometers
         distance = speedInMiles * 1.6;

        // Calculating speed

        speed = distance / time;
        System.out.println("Average speed = " + speed);

//1. Amir Late for School
        double startTime;
        double endTime;
        double schoolDistance = 18;
        double amirTime;
        double amirSpeed;

        //Convert startTime and endTime to minutes
        startTime = (7 * 60) + 45;
        endTime = (7 * 60) + 15;
        //Convert to hours
        amirTime =(startTime - endTime) /  60;
        //Average speed
        amirSpeed = schoolDistance /amirTime;
        System.out.println(amirSpeed);


//2. Maria Jogging Around the Park
        double singleLap = 1.2;
        double mariaTime = 35;
        double completedLaps = 5;
        double totalLap;
        double mariaSpeed;

        totalLap = singleLap * completedLaps;
        mariaTime = mariaTime / 60;
        mariaSpeed = totalLap / mariaTime;
        System.out.println(mariaSpeed);

// 3. The Train Ride
        double trainDistance = 290;
        double leavesBerlin;
        double arrivesHamburg;
        double totalTravelTime;
        double trainSpeed;

        //Convert hours to minutes
        arrivesHamburg = (4 * 60) + 30;
        leavesBerlin = 2 * 60;
        totalTravelTime = arrivesHamburg - leavesBerlin;
        trainSpeed = trainDistance / totalTravelTime;
        System.out.println(trainSpeed);

        //Temperature
//4. Hot Coffee
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

//5. Cold Winter Day
        double munichWeather = -4;
        double munichWeatherToFahrenheit = (munichWeather * 9 / 5) + 32;
        System.out.println(munichWeatherToFahrenheit);

//6. Space science
        double neptuneTemp = -353;
        double neptuneTempToFahrenheit = (neptuneTemp * 9 / 5) + 32;
        System.out.println(neptuneTempToFahrenheit);
//Currency
// 7. Holiday in Spain
        double amountInDollars = 500;
        double oneDollarsToEuros = 0.91;
        double convertToEuros = amountInDollars * oneDollarsToEuros;
        System.out.println(convertToEuros);

//8. Buying a Phone Online
        double phoneCostInEuros = 850;
        double oneEurosToDollars = 1.07;
        double phoneCostInDollars = phoneCostInEuros * oneEurosToDollars;
        System.out.println(phoneCostInDollars);

// 9. Pocket Money
        double liamPocketMoneyInPounds = 20;
        double onePoundToYen = 165;
        double pocketMoneyInYen = liamPocketMoneyInPounds * onePoundToYen;
        System.out.println(pocketMoneyInYen);

//     Geometry  / Area
// 10. Painting a Wall
        double wallWide = 4.2;
        double wallTall = 2.8;
        double wallArea = wallWide * wallTall;
        System.out.println(wallArea);

// 11. Garden Circle
        double gardenRadius = 3.5;
        double pi = 3.14159;
        double gardenArea = pi * gardenRadius * gardenRadius;
        System.out.println(gardenArea);

// 12. Paper Triangle
        double  triangleBase = 12;
        double triangleHeight = 8;
        double areaOfTriangle = (triangleBase * triangleHeight) / 2;
        System.out.println(areaOfTriangle);

// Miscellaneous
// 13.  Healthy Living
        double alexWeightInKilogram = 68;
        double alexHeight = 1.70;
        double alexBMI = alexWeightInKilogram / (alexHeight * alexHeight);
        System.out.println(alexBMI);

// 14.    Fuel for the Trip
         double fuelConsumed = 6.5;
         double fuelPerKM = fuelConsumed / 100;
         double totalDistance = 350;
         double totalFuelConsumed = fuelPerKM * totalDistance;
        System.out.println(totalFuelConsumed);

// 15. Concert Countdown
        int concertStartsInSecs = 10000;
        int concertToHours = concertStartsInSecs / 3600;
        int concertToMinutes = (concertStartsInSecs % 3600) / 60;
        int concertsToSecs = (concertStartsInSecs % 3600) % 60;
        System.out.println("Time is " + concertToHours + ":" + concertToMinutes + ":" + concertsToSecs);

        double b = 2;
       int i = (int)b;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
            int y = input.nextInt();
            int x;
            if ( y >= 0) {
              System.out.println(x = 1);
            };

    //If statement
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a score:");
        double pay = input.nextDouble();
        double percentageIncrement = 0.03 * pay;
        if ( pay >= 90) {
            System.out.println(percentageIncrement+ pay);
        }

        //if/else statement
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a score:");
        double score = input.nextDouble();
        double scoreThreePercentageIncrement = 0.03 * score;
        double scoreOnePercentageIncrement = 0.01 * score;
        if ( score >= 90) {
            System.out.println(scoreThreePercentageIncrement+ score);
        } else {
            System.out.println(scoreOnePercentageIncrement + score);
        }

        double cylinderRadius;
        double cylinderLength;
        double cylinderVolume;
        double cylinderArea;
        final double PI = 3.1415;
        Scanner input = new Scanner(System.in);
        System.out.print("enter the cylinderRadius: ");
        cylinderRadius = input.nextDouble();
        System.out.print("enter the cylinderLength: ");
        cylinderLength = input.nextDouble();
        cylinderArea = cylinderRadius * cylinderRadius * PI;
        cylinderVolume = cylinderArea * cylinderLength;
        System.out.println("Cylinder Area =" + cylinderArea + " and Cylinder Volume =" + cylinderVolume);


        //java.util.Random
        Random random = new Random();
        int randomNumber = random.nextInt(1000); //Generate random number up to 1000
        System.out.println("Random number is =" + randomNumber);
        int extractionOfHundreds = randomNumber /100;
        int extractionOfTens = (randomNumber / 10) % 10;
        int extractionOfOnes = randomNumber % 10;
        int sumOfRandomNumberDigits = extractionOfHundreds + extractionOfTens + extractionOfOnes;
        System.out.println("The sum of the digits in the random number is: " + sumOfRandomNumberDigits);


        Scanner count = new Scanner(System.in);
        System.out.print("enter any number ");
        int countNumber = count.nextInt();
        boolean newLine =  countNumber % 10 == 0;
        System.out.println(newLine);

        Scanner count = new Scanner(System.in);
        System.out.print("enter any number ");
        int countNumber = count.nextInt();
        if (countNumber % 2 == 0)
            System.out.println
                    (countNumber + " is even");
        else if (countNumber % 5 == 0)
            System.out.println
                    (countNumber + " is multiple of 5");

        double underWeight = 18.5;
        double normalWeight = 25.0;
        double overWeight = 30.0;
        final double onePoundToKilogram = 0.45359237;
        final double oneInchToMeter = 0.0254;
        double bodyWeight;
        double BMI;
        Scanner weight = new Scanner(System.in);
        System.out.print("enter your weight in pounds: ");
         bodyWeight = weight.nextDouble();
        Scanner height = new Scanner(System.in);
        System.out.print("enter your height in inches: ");
        double bodyHeight = height.nextDouble();
        double weightInPoundsToKilogram = bodyWeight * onePoundToKilogram;
        double  heightInInchesToMeters = bodyHeight * oneInchToMeter;
        BMI = weightInPoundsToKilogram / (heightInInchesToMeters * heightInInchesToMeters);
        System.out.println("BMI is " + BMI);
        if ( BMI < underWeight){
            System.out.print("You are underweight, work on it");
        } else if ( underWeight <= BMI && BMI < normalWeight)
         {
             System.out.print("You weight is normal, great!");
         } else if (normalWeight <= BMI &&  BMI < overWeight)
         {
             System.out.print("You are overweight, work on it");
         } else if (overWeight <= BMI)
        {
            System.out.print("You are obese!");
        }

        double age;
        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");
        age = input.nextDouble();
        if (age > 13 && age < 18)
        {
          System.out.println("true");
        } else {
            System.out.println("false");
        }


        double weight;
        double height;
        Scanner userInput = new Scanner(System.in);
        System.out.print("What is your weight? ");
        weight = userInput.nextDouble();
        System.out.print("What is your height? ");
        height = userInput.nextDouble();
        if (weight > 50 ^ height > 60)
        {
            System.out.println("true");
        } else
        {
            System.out.println("false");
        }

        Scanner newInput = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = newInput.nextInt();
        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        // Display the result
        System.out.println(year + " is a leap year? " + isLeapYear);

        Scanner newInput = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = newInput.nextInt();
        //Using switch statement
        switch (year % 12) {
            case 0: System.out.println("monkey");
                break;
            case 1: System.out.println("rooster");
                break;
            case 2: System.out.println("dog");
                break;
            case 3: System.out.println("pig");
                break;
            case 4: System.out.println("rat");
                break;
            case 5: System.out.println("ox");
                break;
            case 6: System.out.println("tiger");
                break;
            case 7: System.out.println("rabbit");
                break;
            case 8: System.out.println("dragon");
                break;
            case 9: System.out.println("snake");
                break;
            case 10: System.out.println("horse");
                break;
            case 11: System.out.println("sheep");
                break;
        }

        int x = 1;
        int a = 7;
        switch (a){
            case 1: x += 5;
            break;
            case 2: x += 10;
            break;
            case 3: x += 16;
            break;
            case 4: x += 34;
        }
        System.out.println("x = " + x);

        int days = 2;
        switch (days) {
            case 0: System.out.println("Sunday");
                break;
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
                break;

        java.util.Scanner input = new java.util.Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        System.out.println((x < y && y < z) ? "sorted" : "not sorted");

        int age = 4;
        int ticketPrice;
        ticketPrice = (age>= 16) ? 20 : 10 ;
        System.out.println(ticketPrice);

        double score;
        double scale = 10;
        double x = 2;
        if(x >= 16)
        {
            score = scale * 3;

        } else
        {
            score = scale * 4;
        }
        System.out.println(score);

        double tax;
        double income = 20000;
        if (income > 100000)
        {
            tax = income * 0.2;
        } else {
            tax = income * 0.17;
        }
        System.out.println(tax);

        int result = (Math.random() < 0.9) ? 1 : -1;
        System.out.println(result);

        Random random = new Random();
        int firstRandomNumber = random.nextInt(10);
        int secondRandomNumber = random.nextInt(10);
        int thirdRandomNumber = random.nextInt(10);
        int ans = firstRandomNumber + secondRandomNumber + thirdRandomNumber;
        int revisedUserAnswer;

            //Revised code
        Scanner input = new Scanner(System.in);
        System.out.println("What is the addition of? " + firstRandomNumber + " and " + secondRandomNumber + " and " + thirdRandomNumber );
        revisedUserAnswer = input.nextInt();

        if ( revisedUserAnswer == ans) {
            System.out.println("you are right!!");
        } else {
            System.out.println("you are wrong!");
        }

        //BMI
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your body weight in kilogram:");
        double bodyWeight = input.nextDouble();
        System.out.println("Enter height in meters?");
        double heightInches = input.nextDouble();
        double  BMI = bodyWeight / (heightInches * heightInches);
        System.out.println("Your BMI is:" + BMI);

       int maxNumber = Math.min(10, 3);
        System.out.println(maxNumber);

        double roundingNumber = Math.rint(3.5);
        System.out.println(roundingNumber);

       int number = 50 + (int)(Math.random() * 50);
        System.out.println(number);


        // Math Problems
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coordinate x1");
        double x1 = input.nextDouble();
        System.out.println("Enter coordinate x1");
        double x2 = input.nextDouble();
        System.out.println("Enter coordinate x1");
        double x3 = input.nextDouble();
        System.out.println("Enter coordinate x1");
        double y1 = input.nextDouble();
        System.out.println("Enter coordinate x1");
        double y2 = input.nextDouble();
        System.out.println("Enter coordinate x1");
        double y3 = input.nextDouble();

        double coordinateA = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double coordinateB =  Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double coordinateC = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        java.util.Scanner input = new java.util.Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        System.out.println((x < y && y < z) ? "sorted" : "not sorted");

    }
    }


// quadratic Equation solutions using programming
        double a;
        double b;
        double c;
        double r1;
        double r2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a");
        a = input.nextDouble();
        System.out.println("Enter b");
        b = input.nextDouble();
        System.out.println("Enter c");
        c = input.nextDouble();

         double discriminant = b * b - 4 * a * c;

                if( discriminant > 0) {
                    r1 = (-b  + Math.sqrt(discriminant)) / (2 * a);
                    r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two roots " + r1 + " and " + r2);

        } else if (discriminant == 0) {
                    r1 = -b  / (2 * a);
            System.out.println("The equation has one root: " + r1);

        } else {
            System.out.println("The equation has no real root");
                }


        // Chapter 3 Code Challenge
        double number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = input.nextDouble();

       if (number % 2 == 0)
           System.out.println(number + "is even.");
        System.out.println(number + "is odd.");

       if (number % 2 == 0)
            System.out.println(number + " is even.");
        else
            System.out.println(number + " is odd.");

        double score;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a score:");
        score = input.nextDouble();
        if (score >= 60.0)
            System.out.println("D");
        else if (score >= 70.0)
            System.out.println("C");
        else if (score >= 80.0)
            System.out.println("B");
        else if (score >= 90.0)
            System.out.println("A");
        else
            System.out.println("F");


                // Write an if statement that increases pay by
                // 3% if score is greater than 90,
                // other-wise increases pay by 1%.

            double pay;
            double score;
            double increment;

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a score:");
            score = input.nextDouble();
            System.out.println("Enter a pay:");
            pay = input.nextDouble();

            if (score > 90) {
                increment = pay * 0.03;
                System.out.println(increment + pay);
            } else {
                increment = pay * 0.01;
                System.out.println(increment + pay);
            }

        int x = 5;
        int y = 2;
        int z;

       if (x > 2) {
            if (y > 2) {
                z = x + y;
                System.out.println("z is " + z);
            }
        } else
        System.out.println("x is " + x);


        int month;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer number between 1 to 12:");
        month = input.nextInt();

        switch (month) {
            case 1:  System.out.println("January");
                break;
            case 2:  System.out.println("February");
                break;
            case 3:  System.out.println("March");
                break;
            case 4:  System.out.println("April");
                break;
            case 5:  System.out.println("May");
                break;
            case 6:  System.out.println("June");
                break;
            case 7:  System.out.println("July");
                break;
            case 8:  System.out.println("August");
                break;
            case 9:  System.out.println("September");
                break;
            case 10:  System.out.println("October");
                break;
            case 11:  System.out.println("November");
                break;
            case 12:  System.out.println("December");
                break;
        }


        int firstNumber;
        int secondNumber;
        int thirdNumber;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any integer number");
        firstNumber = input.nextInt();
        System.out.println("Enter any integer number");
        secondNumber = input.nextInt();
        System.out.println("Enter any integer number");
        thirdNumber = input.nextInt();

        if (firstNumber <= secondNumber && firstNumber <= thirdNumber){
            if(secondNumber <= thirdNumber) {
                System.out.println(firstNumber + secondNumber + " " + thirdNumber);
            } else {
                System.out.println(firstNumber + " " + thirdNumber + " " + secondNumber);
            }

        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            if(firstNumber <= thirdNumber){
                System.out.println(secondNumber + " " + firstNumber + " " + thirdNumber);
            } else {
                System.out.println( secondNumber+ " " + thirdNumber + " " + firstNumber);
            }

        } else if(thirdNumber <= firstNumber && thirdNumber <= secondNumber){
            if(firstNumber <= secondNumber){
                System.out.println(thirdNumber + " " + firstNumber + " " + secondNumber);
            } else {
                System.out.println(thirdNumber + " " + secondNumber + " " + firstNumber);
            }
            }  else {
            System.out.println("Not a valid input");
        }

        int d1;
        int d2;
        int d3;
        int d4;
        int d5;
        int d6;
        int d7;
        int d8;
        int d9;
        int d10;
        char lastDigit;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter all 9 digits one after the other: ");
        d1 = input.nextInt();
        d2 = input.nextInt();
        d3 = input.nextInt();
        d4 = input.nextInt();
        d5 = input.nextInt();
        d6 = input.nextInt();
        d7 = input.nextInt();
        d8 = input.nextInt();
        d9 = input.nextInt();

        d10 = (d1 + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) +
                (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;

        if (d10 % 100 == 10) {
            lastDigit = 'X';
            System.out.println("Your ISBN-10 number is " + d1 + d2 + d3 + d4 +
                    d5 + d6 + d7 + d8 + d9 + lastDigit);
        } else {
            System.out.println("Your ISBN-10 number is " + d1 + d2 + d3 + d4 +
                    d5 + d6 + d7 + d8 + d9 + d10);
        }


        System.out.println( Math.sqrt(4));
        System.out.println( Math.sin(2 * Math.PI));
        System.out.println( Math.pow(2, 2));
        System.out.println( Math.log(Math.E));
        System.out.println( Math.rint(2.5)); //rounds to the nearest even no
        System.out.println( Math.round(2.8));
       double toRad = ( Math.toRadians(47));
        System.out.println(toRad);
        double toDeg = ( Math.toDegrees( Math.PI / 7));
        System.out.println(toDeg);

        int ranNum = 34 + (int)(Math.random() * 22);
        System.out.println(ranNum);
        int ranNu = (int)(Math.random() * 1000);
        System.out.println(ranNu);
        double ranNumb = 5.5 + (Math.random() * 50);
        System.out.println(ranNumb);

        //Characters
        char ch = 67;
        System.out.println(ch);

        System.out.println("Hello\nWorld");   // new line
        System.out.println("A\tB");           // tab space
        System.out.println("He said \"Hi!\"");// double quote
        System.out.println("This is a backslash: \\");

        int I = '1';
        System.out.println(I);
        int A = 'A';
        System.out.println(A);
        int B = 'B';
        System.out.println(B);
        int a = 'a';
        System.out.println(a);
        char num = 40;
        System.out.println(num);
        char num2 = 59;
        System.out.println(num2);
        char num3 = 79;
        System.out.println(num3);
        char num4 = 85;
        System.out.println(num4);
        char num5 = 90;
        System.out.println(num5);
        char num6 = 0x71;
        System.out.println(num6);
        char num7 = 0x72;
        System.out.println(num7);
        char num8 = 0x40;
        System.out.println(num8);
        char num9 = 0x5A;
        System.out.println(num9);
        char num10 = 0x7A;
        System.out.println(num10);

        char x = 'a';
        char y = 'c';
        System.out.println(++x);
        System.out.println(y++);
        System.out.println(x - y);

        int lowerCase = 97 + (int)(Math.random() * 26);
        System.out.println((char)lowerCase);

        // To safely return only one character
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input.next();
        char ch = s.charAt(0);
        System.out.println("The character entered is " + ch);

        */

        String s1 = "Welcome";
        String s2 = "welcome";
        boolean isEqual = s1.equals(s2);
            System.out.println(isEqual);
        boolean isEquals = s1.equalsIgnoreCase(s2);
        System.out.println(isEquals);
        int x = s1.compareTo(s2);
        System.out.println(x);
        int x2 = s1.compareToIgnoreCase(s2);
        System.out.println(x2);
        boolean b = s1.startsWith("AAA");
        System.out.println(b);
        boolean b2 = s1.endsWith("AAA");
        System.out.println(b2);
        int x3 = s1.length();
        System.out.println(x3);
        String s3 = s1 + s2;
        System.out.println(s3);
    }


    }









