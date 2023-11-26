//created by Vadim Peregud
package by.academy.homework2;
import java.util.Scanner;
public class Task23 {
    public static void main(String[] args) {
        String word1, word2;
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое слово, состоящее из четного числа букв");
            word1 = sc.next();
            if (word1.length() % 2 != 0) {
                System.out.println("Количество букв должно быть четным");
            } else {
                break;
            }
        }
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите второе слово, состоящее из четного числа букв");
            word2 = sc.next();
            if (word2.length() % 2 != 0) {
                System.out.println("Количество букв должно быть четным");
            } else {
                break;
            }
        }
        System.out.println("Словом, состоящим из первой половины '" + word1 + "' и второй половины '" + word2 + "' будет");
        System.out.println(word1.toUpperCase().substring(0, word1.length() / 2) + word2.toLowerCase().substring(word2.length() / 2, word2.length()));
    }
}
