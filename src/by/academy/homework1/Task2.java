//created by Vadim Peregud
package by.academy.homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите тип переменной ");
            String dataType = in.next();
            switch (dataType) {
                case "int":
                    System.out.println("Введите переменную типа int");
                    int varInt = in.nextInt();
                    System.out.println("Остаток от деления " + varInt + " на 2 составляет " + (varInt % 2));
                    break;
                case "double":
                    System.out.println("Введите переменную типа double");
                    double varDouble = in.nextDouble();
                    System.out.println("70% от числа " + varDouble + " составляет " + (varDouble * 70 / 100));
                    break;
                case "float":
                    System.out.println("Введите переменную типа float");
                    float varFloat = in.nextFloat();
                    System.out.println("Квадрат переменной " + varFloat + " составляет " + varFloat * varFloat);
                    break;
                case "char":
                    System.out.println("Введите переменную типа char");
                    float varChar = in.next().charAt(0);
                    System.out.println("Код введенного символа " + varChar);
                    break;
                case "String":
                    System.out.println("Введите переменную String");
                    in.nextLine();
                    String varString = in.nextLine();
                    System.out.println("Hello " + varString);
                    break;
                default:
                    System.out.println("Unsupported type");
            }
        }
    }
}