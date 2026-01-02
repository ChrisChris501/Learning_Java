import java.util.Random;
import java.util.Scanner;

public class Challenge_ThirdLesson {
        public static void main(String[] args) {

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


            int x = 2;
            int y = 1;
            int a_ = 3;
            int b_ = 2;
            int c_ = 1;
            int m = 3 + 4*(x) / 5 - 10*(y - 5) * (a_ + b_ + c_) / x + 9 * (4/x + 9 + x / y);
            int r;
            System.out.println (m);


            double first = 2;
            double second = 2;
            double third = 1;
            double fourth = 3;
            double rw = 1;
            double fifth = 2;
            double twe = 2;
            double gr;
            fifth = 4 / (3 * ( rw + 34 )) - 9 * (first + second*(third)) + ( 3 + fourth * (2 + first)) / first + second*(fourth);
            gr = 5.5 * Math.pow(rw + 2.5, 2.5 + twe);
            System.out.print("g is equals " + gr);


            int i = 10;
            int newNum = 10 * i++;
            System.out.print("i is " + i
                    + ", newNum is " + newNum
            float f = 12.5F;
            int i = (int)f;
            System.out.println("f is " + f);
            System.out.println("i is " + i);


            double r = (-b + Math.sqrt (Math.pow(b, 2) - 4 * a * c)) / 2 * a;

            //6. Space science
            double neptuneTemp = -353;
            double neptuneTempToFahrenheit = (neptuneTemp * 9 / 5) + 32;
            System.out.println(neptuneTempToFahrenheit);



            // Miscellaneous
            // 13.  Healthy Living
            double alexWeightInKilogram = 68;
            double alexHeight = 1.70;
            double alexBMI = alexWeightInKilogram / (alexHeight * alexHeight);
            System.out.println(alexBMI);
            ky
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


            //java.util.Random
            Random random = new Random();
            int randomNumber = random.nextInt(1000); //Generate random number up to 1000
            System.out.println("Random number is =" + randomNumber);
            int extractionOfHundreds = randomNumber /100;
            int extractionOfTens = (randomNumber / 10) % 10;
            int extractionOfOnes = randomNumber % 10;
            int sumOfRandomNumberDigits = extractionOfHundreds + extractionOfTens + extractionOfOnes;
            System.out.println("The sum of the digits in the random number is: " + sumOfRandomNumberDigits);


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

            Random number = new Random();
            int firstRandomNumber = random.nextInt(10);
            int secondRandomNumber = random.nextInt(10);
            int thirdRandomNumber = random.nextInt(10);
            int ans = firstRandomNumber + secondRandomNumber + thirdRandomNumber;
            int revisedUserAnswer;

            //Revised code

            System.out.println("What is the addition of? " + firstRandomNumber + " and " + secondRandomNumber + " and " + thirdRandomNumber );
            revisedUserAnswer = input.nextInt();

            if ( revisedUserAnswer == ans) {
                System.out.println("you are right!!");
            } else {
                System.out.println("you are wrong!");
            }

            //BMI
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

            int newNumber = 50 + (int)(Math.random() * 50);
            System.out.println(newNumber);


            // Math Problems
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


            double xx = input.nextDouble();
            double yy = input.nextDouble();
            double zz = input.nextDouble();
            System.out.println((xx < yy && yy < zz) ? "sorted" : "not sorted");

        }
    }


    // quadratic Equation solutions using programming
    double ab;
    double bc;
    double cd;
    double r1;
    double r2;

    System.out.println("Enter a");
    ab = input.nextDouble();
                System.out.println("Enter b");
    bc = input.nextDouble();
                System.out.println("Enter c");
    cd = input.nextDouble();

    double discriminant = bc * bc - 4 * ab * cd;

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
    double numb;
    Scanner input = new Scanner(System.in);
                System.out.println("Enter a number:");
    numb = input.nextDouble();

               if (numb % 2 == 0)
            System.out.println(numb + "is even.");
                System.out.println(numb + "is odd.");

               if (numb % 2 == 0)
            System.out.println(numb + " is even.");
                else
                        System.out.println(numb + " is odd.");

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
        };

    } else if(thirdNumber <= firstNumber && thirdNumber <= secondNumber){
        if(firstNumber <= secondNumber){
            System.out.println(thirdNumber + " " + firstNumber + " " + secondNumber);
        } else {
            System.out.println(thirdNumber + " " + secondNumber + " " + firstNumber);
        }
    }  else {
        System.out.println("Not a valid input");
    }

}

}
