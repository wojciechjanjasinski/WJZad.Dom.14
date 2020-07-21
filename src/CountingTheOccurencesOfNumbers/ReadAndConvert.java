package CountingTheOccurencesOfNumbers;


import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ReadAndConvert {
    static String fileName = "Numbers.txt";
    public static void readFromFileToMap(List<String> testList, Map<Integer, Integer> integerMap) throws IOException {
        testList = Files.readAllLines(new File("Numbers.txt").toPath(), Charset.defaultCharset());
        integerMap = new TreeMap<>();
        for (String string: testList){
            Integer count = integerMap.get(string);
            if (count == null)
                count =0;
            integerMap.put(Integer.valueOf(string), count +1);
        }
        for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {
            System.out.println(entry.getKey() + " – liczba wystąpień: " + entry.getValue());
        }
    }
}
