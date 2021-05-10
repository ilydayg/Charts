import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String fileName = "brand_values.txt";
        List<String> list = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            list = stream.filter(line -> line.startsWith("2000")).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(list.get(0));
        for(String string:list){
            System.out.println(string);
        }

    }
}
