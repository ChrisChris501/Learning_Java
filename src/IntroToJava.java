public class IntroToJava {
    public static void main(String[] args) {

        /*
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





        //Format Specifier
        System.out.printf("%5d %d %d\n", 1, 2, 3);
        System.out.printf("amount is %f %e\n", 32.32, 32.32);
        System.out.printf("%6b\n", (1 > 2));
        System.out.printf("%6s\n", "Java");
        System.out.printf("%6b%-8s\n", (1 > 2), "Java");


        //Loop
        int count = 0;
        while (count < 10) {
            System.out.println("Count is lesser than 10");
            count++;
        }

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int answer;

        Scanner input = new Scanner(System.in);

        System.out.println("What is the addition of " + number1 + " + " + number2);
        answer = input.nextInt();

        while (number1 + number2 != answer) {
            System.out.println("Your answer is not correct. What is " + number1 + " + " + number2);
            answer = input.nextInt();
        }
        System.out.println("you are correct!");

        int randomNumber;
        int guessNumber = -1;

        randomNumber = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        while (guessNumber != randomNumber) {
            System.out.print("\nEnter your guess between 0 and 100: ");
            guessNumber = input.nextInt();

            if (guessNumber == randomNumber) {
                System.out.println("Your are right. The number is " + randomNumber);
            } else if (guessNumber < randomNumber) {
                System.out.println("Your guess is to low");
            } else {
                System.out.println("Your guess is too high");
            }
        }

        int count = 0;
        while (count < 100) {
// Point A
            System.out.println("Welcome to Java!");
            count++;
// Point B
        }
// Point C


            Scanner input = new Scanner(System.in);
            int number, max;
            number = input.nextInt();
            max = number;
            while (number != 0) {
                number = input.nextInt();
                if (number > max)
                    max = number;
            }
            System.out.println("max is " + max);
            System.out.println("number " + number);

        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter an integer " +
                "(the input ends if it is 0)");
        int number = input.nextInt();
        do {
            sum += number;
            System.out.println("Enter an integer " +
                    "(the input ends if it is 0)");
            number = input.nextInt();
        } while (number != 0);

        int value;
        for (value = 1; value < 100; value++) {
            System.out.println("Welcome to Java");
        }

        for (i = 0; i <= 1000; i++)
            sum = sum + i;

        long sum = 0;
        int i = 1;
        while (i < 1000) {
            sum = sum + i;
            i++;
            System.out.println(i);
        }

        long sum = 0;
        int i = 1;
        do {
            sum = sum + i;
            i++;
            System.out.println(i);
        } while (i < 1000);

        //Nested loop

        int j;
        int i;
        int k;
        System.out.println(" ");

        System.out.println("                Multiplication Table ");

        for (j = 1; j <= 11; j++){
            System.out.printf("%5d", j );
        }
        System.out.println("\n------------------------------------------------------------");

        for (i = 1; i<= 11; i++) {
            System.out.print(i + " |");
            for (k = 1; k <= 11; k++) {
                System.out.printf("%5d", i * k);
            }
            System.out.println();
        }

        */
        // Methods
        //Exercises to writing Methods.
        int sum;
        int integer = 0;
        for(sum = 1; sum <= 10; sum ++){
            integer += sum;
            System.out.println(integer);
            }

        int num;
        int add = 0;
        for(num = 20; num <= 37; num++){
            add += num;
            System.out.println(add);
        }

        int no;
        int action = 0;
        for(no = 35; no <= 49; no++) {
            action += no;
            System.out.println(action);
        }

        //Can be written as


    }
    }


