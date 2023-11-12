//created by Vadim Peregud
package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner in = new Scanner(System.in);
            System.out.println("ведите число от 1 до 10");
            int chislo = in.nextInt();
            int i = 1;
            while (i <= 10) {
                System.out.print(chislo * i + " ");
                i++;
            }
            System.out.println();
        }
    }
}
