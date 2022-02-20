package week2;

import java.util.Scanner;

public class Task19
/* Print all numbers on the segment from a to b that give the remainder of c when divided by d.
   If such numbers do not exist, then you do not need to display anything.
        Example`
        Input`    Output`
         a 2       2 4
         b 5
         c 0
         d 2
        i.e 2 divided to 2 reminder is 0, 4 divided to 2 reminder is 0 */
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % d == c) {
                System.out.println(i);
            }
        }
    }
}
