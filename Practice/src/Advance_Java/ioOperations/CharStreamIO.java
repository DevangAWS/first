package Advance_Java.ioOperations;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamIO {
    static void main() {
        System.out.println("=== Character Stream Example ===");

        try (FileWriter fw = new FileWriter("Output.txt")) {
            fw.write("this is the first character stream that i have");
            fw.write(" This handles unicode properly");
            System.out.println("Text written in the file properly using char Input");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader("Output.txt")) {
            StringBuilder sb = new StringBuilder();

            int characters;
            while((characters = fr.read()) != -1) {
                sb.append((char)characters);
            }

            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}