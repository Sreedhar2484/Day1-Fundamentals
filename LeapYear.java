//1.7 Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year : ");
        int year = sc.nextInt();

        if (((year%4==0) && (year%100!=0) || (year%400==0))){
            System.out.println("Specified year is a leap year");
        } else {
            System.out.println("Specified year is not a leap year");
        }


    }
}
