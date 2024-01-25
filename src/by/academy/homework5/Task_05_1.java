//created by Vadim Peregud
package by.academy.homework5;


import java.util.*;

public class Task_05_1 {

    public static void main(String[] args) {
        List<String> collectionWithDuplicates = new ArrayList<>() {{
            add("Hello");
            add("Hello");
            add("By");
            add("Hell");
            add("HelloW");
            add("By");
        }};
        Set<String> collectionWithOutDuplicates = removeDuplicate(collectionWithDuplicates);
        System.out.println(collectionWithOutDuplicates);
    }

    private static Set<String> removeDuplicate(List<String> collectionWithDuplicates) {
        return new LinkedHashSet<>(collectionWithDuplicates);
    }
}

