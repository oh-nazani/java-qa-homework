package week2;

import java.util.Scanner;

public class Task12Weekdays
/* Given the String variable day holding the name of the weekday
   Sunday, Monday, etc., set an int variable to 1, 2, etc. */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weekdayNum = scanner.nextInt();
        String weekday;
        switch (weekdayNum) {
            case 1:
                weekday = "Sunday";
                break;
            case 2:
                weekday = "Monday";
                break;
            case 3:
                weekday = "Tuesday";
                break;
            case 4:
                weekday = "Wednesday";
                break;
            case 5:
                weekday = "Thursday";
                break;
            case 6:
                weekday = "Friday";
                break;
            case 7:
                weekday = "Saturday";
                break;
            default:
                weekday = "The weekday isn't found. Use a valid number (1-7).";
        }
        System.out.println(weekday);
    }
}
