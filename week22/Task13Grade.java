package week2;

import java.util.Scanner;

public class Task13Grade
/* The program will read three types of scores(quiz, mid-term, and final scores)
   and determine the grade based on the following rules:
   -if the average score >= 80% =>grade=A
   -if the average score >= 60% and <80% => grade=B
   -if the average score>= 40% and < 60% =>grade=C
   -else.=>grade=F */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short quiz = scanner.nextShort();
        short midTerm = scanner.nextShort();
        short finalScore = scanner.nextShort();
        int averageScore = (quiz + midTerm + finalScore) / 3;
        if (averageScore >= 80) {
            System.out.println("grade = A");
        } else if ((averageScore >= 60) && (averageScore <= 80)) {
            System.out.println("grade = B");
        } else if ((averageScore >= 40) && (averageScore < 60)) {
            System.out.println("grade = C");
        } else {
            System.out.println("grade = F");
        }
    }
}
