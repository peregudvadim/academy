//created by Vadim Peregud
package by.academy.homework2;
import java.io.IOException;
import java.util.Scanner;
public class Solution {
    private static int pairs(int k, int[] arr) {
        int pairsCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (pairsCount == -1) {
                break;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    pairsCount = -1;
                    System.out.println("������ �������� ���������!");
                    break;
                }
                if (k < 0 || k > Math.pow(10, 9)) {
                    pairsCount = -1;
                    System.out.println("������� �������� ������� �� ������� �����������!");
                    break;
                }
                if (arr[i] < 0 || arr[i] > Math.pow(2, 31) - 1) {
                    pairsCount = -1;
                    System.out.println("�������� �������� ������� ������� �� ������� �����������!");
                    break;
                }
                if (Math.abs(arr[i] - arr[j]) == k) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("������� ����� ������ ������ ������� � ������� ��������");
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        if (n <= 2 || n >= Math.pow(10, 5)) {
            System.out.println("������ ������� ������� �� ������� �����������!");
            return;
        }
        int k = Integer.parseInt(nk[1]);
        int[] arr = new int[n];
        System.out.println("������� " + n + " �������� ����� ������ ��� ����������");
        String[] arrItems = scanner.nextLine().split(" ");
        if (arrItems.length != n) {
            System.out.println("������ ���������� ������� �� ������������� ���������� ������� �������!");
            return;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrItems[i]);
        }
        int pairsCount = pairs(k, arr);
        if (pairsCount != -1) {
            System.out.println(pairsCount + " ���(�), �������� ������� ����� " + k);
        }
        scanner.close();
    }
}

