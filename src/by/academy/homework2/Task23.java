//created by Vadim Peregud
package by.academy.homework2;
import java.util.Scanner;
public class Task23 {
    public static void main(String[] args) {
        String word1, word2;
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("������� ������ �����, ��������� �� ������� ����� ���� ");
            word1 = scanner.next();
            if (word1.length() % 2 != 0) {
                System.out.println("���������� ���� ������ ���� ������");
            } else {
                break;
            }
        }
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("������� ������ �����, ��������� �� ������� ����� ���� ");
            word2 = scanner.next();
            if (word2.length() % 2 != 0) {
                System.out.println("���������� ���� ������ ���� ������");
            } else {
                break;
            }
        }
        System.out.println();
        System.out.println("������, ��������� �� ������ ��������  '" + word1 + "' � ������ �������� '" + word2 + "' ����� ");
        System.out.println(word1.toUpperCase().substring(0, word1.length() / 2) + word2.toLowerCase().substring(word2.length() / 2, word2.length()));
    }
}
