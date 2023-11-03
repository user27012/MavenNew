package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String inputFileName = "src/main/java/org/example/input.txt";
            String outputFileName = "src/main/java/org/example/output.txt";

            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

            String line;
            while ((line = reader.readLine()) != null) {
                // Замінити прийменники на "Java" у рядку
                String modifiedLine = line.replaceAll("\\bwas\\b|\\bwere\\b|\\bon\\b|\\bin\\b|\\bat\\b|\\bfor\\b|\\bmy\\b|\\ball\\b", "Java");


                // Записати змінений рядок у вихідний файл
                writer.write(modifiedLine);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Дешифрація завершена. Результат збережено у файлі " + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
