//created by Vadim Peregud
package by.academy.homework6;

import java.io.*;
import java.util.*;

public class Task_06_4 {
    public static void main(String[] args) {
        List<String> fileNames = new ArrayList<>();
        try {
            File inputFile = new File("inputFile06.txt");
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String inputText = reader.readLine();
            int inputLength = inputText.length();
            reader.close();

            Random random = new Random();
            File directory = new File("Files");
            if (!directory.exists()) {
                boolean dirCreated = directory.mkdir();
                System.out.println("result of creating directory '" + directory.getName() + "' is " + dirCreated);

            }
            for (int i = 1; i <= 100; i++) {
                String fileName = "Files/" + i + ".txt";
                File file = new File(fileName);
                FileWriter writer = new FileWriter(file);
                int randomLength = random.nextInt(inputLength);
                String textToWrite = inputText.substring(0, randomLength);
                writer.write(textToWrite);
                writer.close();
                fileNames.add(fileName + " - " + textToWrite.length() + " characters");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File resultFile = new File("result4.txt");
            FileWriter writer = new FileWriter(resultFile);

            for (String fileInfo : fileNames) {
                writer.write(fileInfo + "\n");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}