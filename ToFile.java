import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class ToFile {
    public static void newLine(String text, String fileName){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.newLine();
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ToFile.newLine("Get off of my cloud!", "test.txt");
    }
}
