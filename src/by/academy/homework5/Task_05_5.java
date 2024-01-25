//created by Vadim Peregud
package by.academy.homework5;

import java.util.HashMap;
import java.util.Map;

public class Task_05_5 {

    public static void main(String[] args) {
        String string = "If you stick a stock of liquor in your locker it is slick to stick a lock upon your stock " +
                "or some joker who is slicker is going to trick you of your liquor if you fail to lock your liquor with a lock";

        Map<Character, Integer> characterMap = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            Character current = string.charAt(i);
            if (characterMap.containsKey(current)) {
                characterMap.put(current, (characterMap.get(current) + 1));
            } else {
                characterMap.put(current, 1);
            }
        }
        System.out.println(characterMap);
    }
}

