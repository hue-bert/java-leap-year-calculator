import java.util.Scanner;

public class LeapYearCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter year to check is its a leap year:");
        year = scanner.nextInt();
        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        if (year <= 1 || year >= 9999) {
            return false;
        } else if (year % 4 == 0) {

            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return false;
            }
            return false;
        }return false;
    }
}