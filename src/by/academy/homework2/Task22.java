//created by Vadim Peregud
package by.academy.homework2;
import java.util.Scanner;
public class Task22 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько слов вы желаете сравнить?");
        for (; ; ) {
            if (!scanner.hasNextInt()) {
                System.out.println("Повторяю, сколько слов вы желаете сравнить?");
                scanner = new Scanner(System.in);
            } else {
                n = scanner.nextInt();
                if (n < 2) {
                    System.out.println("Слов должно быть больше 1");
                } else {
                    break;
                }
            }
        }
        int count;
        int[] place = new int[n];
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите слово " + (i + 1));
            String word = scanner.next();
            count = countSymbols(word);
            place[i] = count;
            words[i] = word;
        }
        int minimum = place[0];
        int position = 0;
        for (int i = 1; i < place.length; i++) {
            if (place[i] < minimum) {
                minimum = place[i];
                position = i;
            }
        }
        System.out.println("Слово с минимальным количеством уникальных символов '" + words[position] + "'");
    }

    public static int countSymbols(String word) {
        int[] letters = new int[65000];
        char[] charArray = word.toCharArray();
        for (char c : charArray) {
            letters[c]++;
        }
        int count = 0;
        for (int i = 0; i < 65000; i++) {
            if (letters[i] > 0) {
                count++;
            }
        }
        return count;
    }
}