package jdbc javafx;
import java.io.*;

public class BufferedIODemo {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("buffered.txt"));
             BufferedReader reader = new BufferedReader(new FileReader("buffered.txt"))) {
            
            writer.write("Buffered I/O is more efficient.");
            writer.newLine();
            writer.write("This is the second line.");
            writer.close();
            
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
