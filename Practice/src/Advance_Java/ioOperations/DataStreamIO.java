package Advance_Java.ioOperations;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamIO {
    static void main() {
        System.out.println("=== Data Streams Example ===");

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))) {
            dos.writeInt(42);
            dos.writeDouble(4.3654);
            dos.writeBoolean(true);
            dos.writeFloat((float)Math.PI);
            dos.writeUTF("hello dev here");
            System.out.println("Data entered into data stream successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
            int num = dis.readInt();
            double ran = dis.readDouble();
            float pi = dis.readFloat();
            boolean flag = dis.readBoolean();
            String text = dis.readUTF();
            System.out.println("Data read: ");
            System.out.println(" Integer: " + num);
            System.out.println(" Double: " + ran);
            System.out.println(" Float: " + pi);
            System.out.println(" Boolean: " + flag);
            System.out.println(" String: " + text);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
