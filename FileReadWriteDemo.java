package jdbc javafx;
import java.io.*;

public class FileReadWriteDemo {
    public static void main(String[] args) {
        try {
            // Writing to a file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a test file.");
            writer.close();
            
            // Reading from a file
            FileReader reader = new FileReader("example.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
