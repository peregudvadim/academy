//created by Vadim Peregud
package by.academy.homework4.task_4_4;
import java.util.*;
public class IteratorApp {
    public static void main(String[] args) {
        int n = 30;
        Integer []array = new Integer[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i]=(random.nextInt(1, 100));
        }

        CustomIterator<Integer> iterator = new CustomIterator<>(array);
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }

}

