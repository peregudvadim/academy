//created by Vadim Peregud
package by.academy.homework5;

import java.util.Iterator;
import java.util.Random;

public class Task_05_3 {
    public static void main(String[] args) {

        Integer[][] integerArray = new Integer[6][6];
        for (int i = 0; i < integerArray.length; i++) {
            for (int j = 0; j < integerArray[i].length; j++) {
                integerArray[i][j] = new Random().nextInt(100, 1000);
            }
        }

        Iterator<Integer> arrayForIterator = new ArrayIterator<>(integerArray);
        while (arrayForIterator.hasNext()) {
            System.out.print(arrayForIterator.next() + " ");
        }
    }
}

