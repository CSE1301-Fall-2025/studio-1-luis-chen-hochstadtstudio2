package studio1;
import java.util.Scanner;


public class LeapYear {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a year: ");
    int year = in.nextInt();
    boolean isLeapYear = false;
    System.out.print(year);
    System.out.print (" is a leap year: ");
    System.out.println ( year%4==0 && year%100 !=0 || year%400 == 0);
    }
}
