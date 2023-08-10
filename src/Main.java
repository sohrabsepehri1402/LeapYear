import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Year :");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 !=0) || (year % 400 ==0);

        System.out.println(year + " is a loop year? " + isLeapYear);
    }
}