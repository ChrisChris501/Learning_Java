
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

        double fahrenheit = 0;
        double celsius = 0;
        Scanner userInput =  new Scanner (System.in);

        System.out.print("enter a degree fahrenheit: ");
        fahrenheit = userInput.nextDouble();

        celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.print("fahrenheit " + fahrenheit + " is " + celsius + " in celsius");
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

        //speed
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
        System.out.println("Converted coffee Temp is " + pouredCoffeeTemp + "degree fahrenheit");
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

*/

        double cylinderRadius;
        double cylinderLength;
        double cylinderVolume;
        double cylinderArea;
        double PI = 3.1415;
        Scanner cylinder = new Scanner(System.in);
        System.out.print("enter a degree cylinderRadius: ");
        cylinderRadius = cylinder.nextDouble();
        System.out.print("enter a degree cylinderLength: ");
        cylinderLength = cylinder.nextDouble();

        cylinderArea = cylinderRadius * cylinderRadius * PI;
        cylinderVolume = cylinderArea * cylinderLength;
        System.out.print("Cylinder Area =" + cylinderArea + " Cylinder Volume =" + cylinderVolume);


    }
}

