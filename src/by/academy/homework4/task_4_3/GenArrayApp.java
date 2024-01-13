//created by Vadim Peregud
package by.academy.homework4.task_4_3;

import java.util.Arrays;
import java.util.Random;

public class GenArrayApp {
    public static void main(String[] args) {
        GenArray<Integer> integerGenArray = new GenArray<>();
        integerGenArray.showSize();
        GenArray<Integer> integerGenArray2 = new GenArray<>(25);
        integerGenArray2.showSize();
        integerGenArray.add(15);
        integerGenArray.add(25);
        integerGenArray.add(35);
        integerGenArray.add(45);
        integerGenArray.add(55);
        int index=4;
        System.out.println("Element in index "+ index+" "+integerGenArray.get(index));
        integerGenArray.removeByIndex(1);
        Random random = new Random();
        int n = 25;
        for (int i = 0; i < n; i++) {
            integerGenArray.add(random.nextInt(1, 100));

        }
        integerGenArray.showSize();
        integerGenArray.removeByValue(35);
        System.out.println(integerGenArray.getLast());
        System.out.println(integerGenArray.getFirst());
        integerGenArray.showIndexLastElement();
        System.out.println(integerGenArray.get(27));
        System.out.println(Arrays.toString(integerGenArray.getArray()));
        GenArray<String>stringGenArray=new GenArray<>(11);
        stringGenArray.add("hello-1");
        stringGenArray.add("hello-2");
        stringGenArray.add("hello-3");
        stringGenArray.add("hello-4");
        stringGenArray.add("hello-5");
        stringGenArray.add("hello-6");
        stringGenArray.removeByValue("hello-3");
        System.out.println(Arrays.toString(stringGenArray.getArray()));


    }


}