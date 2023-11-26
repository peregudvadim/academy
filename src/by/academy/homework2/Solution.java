//created by Vadim Peregud
package by.academy.homework2;
import java.io.IOException;
import java.util.Scanner;
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    private static int pairs(int k, int[] arr) {
        int pairsCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (pairsCount == -1) {
                break;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    pairsCount = -1;
                    System.out.println("Массив содержит дубликаты!");
                    break;
                }
                if (k < 0 || k > Math.pow(10, 9)) {
                    pairsCount = -1;
                    System.out.println("Целевое значение выходит за пределы допустимого!");
                    break;
                }
                if (arr[i] < 0 || arr[i] > Math.pow(2, 31) - 1) {
                    pairsCount = -1;
                    System.out.println("Значение элемента массива выходит за пределы допустимого!");
                    break;
                }
                if (arr[i] - arr[j] == k || arr[j] - arr[i] == k) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Введите через пробел размер массива и целевое значение");
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        if (n <= 2 || n >= Math.pow(10, 5)) {
            System.out.println("Размер массива выходит за пределы допустимого!");
            return;
        }
        int k = Integer.parseInt(nk[1]);
        int[] arr = new int[n];
        System.out.println("Введите " + n + " значений через пробел без дубликатов");
        String[] arrItems = scanner.nextLine().split(" ");
        if (arrItems.length != n) {
            System.out.println("Размер введенного массива не соответствует указанному размеру массива!");
            return;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrItems[i]);
        }
        int pairsCount = pairs(k, arr);
        if (pairsCount != -1) {
            System.out.println(pairsCount + " пар(ы), разность которых равна " + k);
        }
        scanner.close();
    }
}

