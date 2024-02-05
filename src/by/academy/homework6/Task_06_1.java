//created by Vadim Peregud
package by.academy.homework6;

import java.io.*;
import java.util.Scanner;

public class Task_06_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String input;
            while (!(input = scanner.nextLine()).equalsIgnoreCase("stop")) {
                writer.write(input);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}