//created by Vadim Peregud
package by.academy.homework2;
import java.util.Scanner;
public class Task21 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("������� ������");
        String firstString = scanner.nextLine();
        System.out.println("������� ������ ��� ���������");
        String secondString = scanner.nextLine();
        boolean areStringsEqual = areStringsEqual(firstString, secondString);
        System.out.println("������" + ((areStringsEqual) ? " �����" : " �� �����"));
        scanner.close();
    }

    public static boolean areStringsEqual(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        }
        int[] letters = new int[65000];
        char[] charArray = firstString.toCharArray();
        for (char c : charArray) {
            letters[c]++;
        }
        for (int i = 0; i < secondString.length(); i++) {
            int c = secondString.charAt(i);
            if (letters[c] == 0) {
                return false;
            }
        }
        return true;
    }
}




