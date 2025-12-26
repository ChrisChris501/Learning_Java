import java.util.Scanner;
public class Switch_Statements {
    public static void main(String[] args) {
        Scanner newInput = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = newInput.nextInt();
        //Using switch statement
        switch (year % 12) {
            case 0:
                System.out.println("monkey");
                break;
            case 1:
                System.out.println("rooster");
                break;
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
                break;
        }

        int x = 1;
        int a = 7;
        switch (a) {
            case 1:
                x += 5;
                break;
            case 2:
                x += 10;
                break;
            case 3:
                x += 16;
                break;
            case 4:
                x += 34;
        }
        System.out.println("x = " + x);

        int days = 2;
        switch (days) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

        int month;
        System.out.println("Enter a integer number between 1 to 12:");
        month = newInput.nextInt();

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
    }
}
