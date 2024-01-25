//created by Vadim Peregud
package by.academy.homework5;

import java.util.Arrays;
import java.util.Random;

public class Task_05_6 {
    public static void main(String[] args) {

        int[] array = new int[8];
        add(array, 10);
        System.out.println(Arrays.toString(array));
    }

    public static void add(int[] array, int index) {
        try {
            for (int i = 0; i < index; i++) {
                array[i] = new Random().nextInt(100, 1000);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array is too small, expand the array");
        }
    }
}
