import java.io.*;
import java.util.Scanner;

public class xxx
{
    public static void main(String[] args) throws IOException {

        FileInputStream input = new FileInputStream("c:\\Users\\natal\\Desktop\\example1.txt");
        FileOutputStream output = new FileOutputStream ("c:\\Users\\natal\\Desktop\\example2.txt");

        while (input.available() > 0) {
            int data = input.read();
            output.write(data);

        }

        input.close();
        output.close();

    }


}



