package Advance_Java.ioOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamIO {
    static void main() {
        System.out.println("=== Byte Stream Example ===");

        try (FileOutputStream fos = new FileOutputStream("Output.dat")) {
            String data = "Hello, Byte Stream!";
            fos.write(data.getBytes());
            System.out.println("Data written to file using byte stream!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("output.dat")) {
            StringBuilder sb = new StringBuilder();

            int content;
            while((content = fis.read()) != -1) {
                sb.append((char)content);
            }

            System.out.println("Data read from the file is " + String.valueOf(sb));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
