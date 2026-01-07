package Advance_Java.ioOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferIO {
    static void main() {
        System.out.println("=== Buffer Stream Example ===");

        try (BufferedWriter bfw = new BufferedWriter(new FileWriter("buffer.txt"))) {
            bfw.write("Line 1: buffer streams are more efficient.");
            bfw.newLine();
            bfw.write("Line 2: They reduce the number of IO operations.");
            bfw.newLine();
            bfw.write("Line 3: Always use them for better performance.");
            System.out.println("Data successfully written buffered writer");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bfr = new BufferedReader(new FileReader("buffer.txt"))) {
            System.out.println("Reading line by line: ");

            String line;
            while((line = bfr.readLine()) != null) {
                System.out.println("    " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}