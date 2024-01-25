//created by Vadim Peregud
package by.academy.homework5;

import java.util.*;

public class Task_05_4 {
    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            values.add(new Random().nextInt(4, 11));
        }
        System.out.println(values);

        Iterator<Integer> iterator = values.iterator();
        int max = 0;
        while (iterator.hasNext()) {
            Integer current = iterator.next();

            if (current > max) {
                max = current;
            }
        }
        System.out.println("Max value " + max);
    }
}
