//created by Vadim Peregud
package by.academy.homework2;
import java.util.Scanner;
public class Task23 {
    public static void main(String[] args) {
        String word1, word2;
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("¬ведите первое слово, состо€щее из четного числа букв ");
            word1 = scanner.next();
            if (word1.length() % 2 != 0) {
                System.out.println(" оличество букв должно быть четным");
            } else {
                break;
            }
        }
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("¬ведите второе слово, состо€щее из четного числа букв ");
            word2 = scanner.next();
            if (word2.length() % 2 != 0) {
                System.out.println(" оличество букв должно быть четным");
            } else {
                break;
            }
        }
        System.out.println();
        System.out.println("—ловом, состо€щим из первой половины  '" + word1 + "' и второй половины '" + word2 + "' будет ");
        System.out.println(word1.toUpperCase().substring(0, word1.length() / 2) + word2.toLowerCase().substring(word2.length() / 2, word2.length()));
    }
}
