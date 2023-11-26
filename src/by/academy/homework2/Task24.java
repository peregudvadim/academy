//created by Vadim Peregud
package by.academy.homework2;
import java.util.Random;
import java.util.Scanner;
public class Task24 {
    public static void main(String[] args) {
        int n;
        String[] suits = {"Пик", "Черв", "Треф", "Бубен"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        int deckLength = suits.length * rank.length;
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество игроков");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 0 || n * 5 > deckLength) {
                    System.out.println("Количество игроков не может быть таким");
                } else {
                    scanner.close();
                    break;
                }
            }
        }
        String[] deck = new String[deckLength];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }
        for (int j = 0; j <= 10; j++) {
            for (int i = 0; i < deckLength; i++) {
                int r = new Random().nextInt(0, deckLength - 1);
                String temp = deck[r];
                deck[r] = deck[i];
                deck[i] = temp;
            }
        }
        for (int i = 0; i < n * 5; i++) {
            System.out.println(deck[i]);
            if (i % 5 == 4)
                System.out.println();
        }
    }
}


