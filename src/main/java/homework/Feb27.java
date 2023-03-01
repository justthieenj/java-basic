package homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Feb27 {
    public static void main(String[] args) {
        // 1. Read the text-file.txt (located in src/test/resources/) and print out the content of the file.
        storeFileContent("src/test/resources/text-file.txt").forEach(System.out::println);
        // 2. Read the fruits.txt (located in src/test/resources/) and stored the content of the file in a List<String>.
        List<String> fruits = storeFileContent("src/test/resources/fruits.txt");
        fruits.forEach(System.out::println);
    }

    public static void readFile(String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> storeFileContent(String path) {
        List<String> fileContent;
        try {
            fileContent = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileContent;
    }
}
