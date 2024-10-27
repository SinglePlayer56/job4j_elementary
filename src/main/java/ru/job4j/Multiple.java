package ru.job4j;

import java.io.FileOutputStream;
import java.io.IOException;

public class Multiple {
    public static void main(String[] args) {
        try (FileOutputStream output = new FileOutputStream("../../maven-projects/job4j_design/data/dataresult.txt")) {
            for (int i = 1; i < 10; i++) {
                output.write("1 * %d = %d".formatted(i, i).getBytes());
                output.write(System.lineSeparator().getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
