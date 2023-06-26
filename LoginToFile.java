import java.io.FileWriter;
import java.io.IOException;

public class LoginToFile {
    public void writeToFile(Toy toy) throws IOException {
        FileWriter writer = new FileWriter("results.txt", true);
        writer.write(toy.toString());
        writer.write("\n");
        writer.flush();

    }
}
