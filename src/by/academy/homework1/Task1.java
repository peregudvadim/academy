//created by Vadim Peregud
package by.academy.homework1;

import java.util.Scanner;

public class Task1 {
    double skidka(double sp, int vs) {
        double stoimost = sp - (sp * vs / 100);
        System.out.println("Стоимость покупки с " + vs + "% " + "скидкой составляет " + stoimost);
        return stoimost;
    }
}

class Task1App {
    public static void main(String[] args) {
        for (; ; ) {
            Task1 summaPokupki = new Task1();
            Scanner inSum = new Scanner(System.in);
            Scanner inAge = new Scanner(System.in);
            System.out.print("Введите сумму покупки: ");
            double varSum = inSum.nextDouble();
            int velichinaSkidki;
            if (varSum >= 400) {
                velichinaSkidki = 20;
                summaPokupki.skidka(varSum, velichinaSkidki);
            } else if (varSum >= 300) {
                velichinaSkidki = 15;
                summaPokupki.skidka(varSum, velichinaSkidki);
            } else if (varSum >= 200) {
                System.out.print("Введите возраст покупателя:");
                int varAge = inAge.nextInt();
                velichinaSkidki = (varAge >= 18) ? 16 : 9;
                summaPokupki.skidka(varSum, velichinaSkidki);
            } else if (varSum >= 100) {
                velichinaSkidki = 7;
                summaPokupki.skidka(varSum, velichinaSkidki);
            } else if (varSum > 0) {
                velichinaSkidki = 5;
                summaPokupki.skidka(varSum, velichinaSkidki);
            } else {
                System.out.println("Программа будет завершена");
                break;
            }
        }
    }
}


