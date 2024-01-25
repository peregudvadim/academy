//created by Vadim Peregud
package by.academy.homework5;


import java.util.*;

public class Task_05_2 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        addElements(arrayList);
        addElements(linkedList);
        long start = System.currentTimeMillis();
        int lastRandomElem = searchRandomElement(arrayList);
        long end = System.currentTimeMillis() - start;
        System.out.println("In ArrayList 100,000 items found for  " + end + " ms, last random element: " + lastRandomElem);
        start = System.currentTimeMillis();
        lastRandomElem = searchRandomElement(linkedList);
        end = System.currentTimeMillis() - start;
        System.out.println("In LinkedList 100,000 items found for " + end + " ms, last random element: " + lastRandomElem);

    }


    private static void addElements(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(random.nextInt(1, 1000));
        }
    }

    private static int searchRandomElement(List<Integer> list) {
        int randomElem = 0;
        Random random = new Random();
        for (int i = 0; i < 100_000; i++) {
            randomElem = list.get(random.nextInt(0, 1_000_000));
        }
        return randomElem;
    }
    // ArrayList находит элементы быстрее, чем LinkedList, так как ArrayList имеет прямые ссылки на каждый элемент в списке,
    // поэтому может получить n-й элемент за постоянное время. LinkedList должен пройти список с начала, чтобы добраться до n-го элемента.
}
