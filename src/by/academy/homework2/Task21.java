//created by Vadim Peregud
package by.academy.homework2;

import java.util.Scanner;

public class Task21 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите строку");
        String firstString = scanner.nextLine();
        System.out.println("Введите строку для сравнения");
        String secondString = scanner.nextLine();
        boolean areStringsEqual = areStringsEqual(firstString, secondString);
        System.out.println("Строки" + ((areStringsEqual) ? " равны" : " не равны"));

        scanner.close();
    }

    private static boolean areStringsEqual(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        }
        int[] letters = new int[65000];
        char[] charArray = firstString.toCharArray();
        for (char c : charArray) {
            letters[c]++;
        }
        int countMatch = 0;
        for (int i = 0; i < secondString.length(); i++) {
            if (letters[secondString.charAt(i)] == 0) {
                return false;

//                добавленная проверка
            } else {
                countMatch++;
                letters[secondString.charAt(i)]--;
            }
        }
            if (countMatch == charArray.length) {
                return true;
            } else return false;

    }
}



