 import java.util.Scanner;

    public class Characters {
        public static void main(String[] args) {

            // Characters
            char ch1 = 67;   // ASCII value
            System.out.println(ch1); // C

            System.out.println("Hello\nWorld");     // new line
            System.out.println("A\tB");             // tab
            System.out.println("He said \"Hi!\"");  // double quote
            System.out.println("This is a backslash: \\");


            // Character to Integer (ASCII)
            int digit = '1';
            System.out.println(digit);

            int capA = 'A';
            System.out.println(capA);

            int capB = 'B';
            System.out.println(capB);

            int smallA = 'a';
            System.out.println(smallA);


            // Character Values
            char num1 = 40;
            char num2 = 59;
            char num3 = 79;
            char num4 = 85;
            char num5 = 90;

            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num4);
            System.out.println(num5);

            char hex1 = 0x71;
            char hex2 = 0x72;
            char hex3 = 0x40;
            char hex4 = 0x5A;
            char hex5 = 0x7A;

            System.out.println(hex1);
            System.out.println(hex2);
            System.out.println(hex3);
            System.out.println(hex4);
            System.out.println(hex5);


            // Character Increment
            char x = 'a';
            char y = 'c';

            System.out.println(++x); // b
            System.out.println(y++); // c
            System.out.println(x - y); // ASCII subtraction


            // Random Lowercase Letter
            int lowerCase = 97 + (int) (Math.random() * 26);
            System.out.println((char) lowerCase);


            // Input: Single Character
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a character: ");
            String s = input.next();
            char userChar = s.charAt(0);
            System.out.println("The character entered is " + userChar);


            // String Comparison
            String s1 = "Welcome";
            String s2 = "welcome";

            System.out.println(s1.equals(s2));               // false
            System.out.println(s1.equalsIgnoreCase(s2));     // true
            System.out.println(s1.compareTo(s2));            // ASCII difference
            System.out.println(s1.compareToIgnoreCase(s2));  // 0

            System.out.println(s1.startsWith("AAA"));        // false
            System.out.println(s1.endsWith("AAA"));          // false
            System.out.println(s1.length());                 // 7

            String s3 = s1 + s2;
            System.out.println(s3);

            System.out.println(s1.toLowerCase());
            System.out.println(s1.toUpperCase());

            String s6 = ("\t s1 \t").trim();
            System.out.println(s6);

            input.close();
        }
    }



