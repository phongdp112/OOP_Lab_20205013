package hust.soict.dsai.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class NoGarbage {
    public static void main(String[] args) {
        String filename = "src/hust/soict/dsai/garbage/test.txt";
        byte[] inputBytes = { 0 };
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            for (byte b : inputBytes) {
                sb.append((char) b);
            }
            String outputString = sb.toString();
            endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}