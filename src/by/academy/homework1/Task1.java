//created by Vadim Peregud
package by.academy.homework1;

import java.util.Scanner;

public class Task1 {
    double applyDiscount(double sp, int vs) {
        double cost = sp - (sp * vs / 100);
        System.out.println("Стоимость покупки с " + vs + "% " + "скидкой составляет " + cost);
        return cost;
    }
}

class Task1App {
    public static void main(String[] args) {
        for (; ; ) {
            Task1 purchaseSum = new Task1();
            Scanner inSum = new Scanner(System.in);
            Scanner inAge = new Scanner(System.in);
            System.out.print("Введите сумму покупки: ");
            double varSum = inSum.nextDouble();
            System.out.print("Введите возраст покупателя:");
            int varAge = inAge.nextInt();
            int volDiscount;
            if (varSum >= 400) {
                volDiscount = 20;
                purchaseSum.applyDiscount(varSum, volDiscount);
            } else if (varSum >= 300) {
                volDiscount = 15;
                purchaseSum.applyDiscount(varSum, volDiscount);
            } else if (varSum >= 200) {
                volDiscount = (varAge >= 18) ? 16 : 9;
                purchaseSum.applyDiscount(varSum, volDiscount);
            } else if (varSum >= 100) {
                volDiscount = 7;
                purchaseSum.applyDiscount(varSum, volDiscount);
            } else if (varSum > 0) {
                volDiscount = 5;
                purchaseSum.applyDiscount(varSum, volDiscount);
            } else {
                System.out.println("Программа будет завершена");
                break;
            }
        }
    }
}


