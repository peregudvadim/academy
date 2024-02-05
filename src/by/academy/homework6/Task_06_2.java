//created by Vadim Peregud
package by.academy.homework6;

import java.io.*;

public class Task_06_2 {
    public static void main(String[] args) throws IOException {

        String inputFile = "inputFile06.txt";
        String outputFile = "result.txt";

        BufferedReader reader;
        BufferedWriter writer;
        try {
            reader = new BufferedReader(new FileReader(inputFile));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            writer = new BufferedWriter(new FileWriter(outputFile));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        String line;
        while ((line = reader.readLine()) != null) {
            line = line.replaceAll("\\s", "");
            writer.write(line);
        }

        reader.close();
        writer.close();
        System.out.println("Program finished successfully");

    }
}