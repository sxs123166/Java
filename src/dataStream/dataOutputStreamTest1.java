package dataStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class dataOutputStreamTest1 {
    public static void main(String[] args) {
        try (
                DataInputStream dsi = new DataInputStream(new FileInputStream("src/test8.txt"));

                ){
            int i = dsi.readInt();
            System.out.println(i);

            double d = dsi.readDouble();
            System.out.println(d);

            boolean b = dsi.readBoolean();
            System.out.println(b);

            String s = dsi.readUTF();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
