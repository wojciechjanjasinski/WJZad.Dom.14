package CountingTheOccurencesOfNumbers;


import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) throws IOException {
        List<String> testList = Files.readAllLines(new File("Numbers.txt").toPath(), Charset.defaultCharset());
        List<Integer> integerTestList = ConvertListStringToInteger.convertStringListToInteger(testList, Integer :: parseInt);
        Map<Integer, Integer> testMap = new TreeMap<>();
        for (Integer integer: integerTestList){
            Integer count = testMap.get(integer);
            if (count == null)
                count = 0;
            testMap.put(integer, count +1);
        }
        for (Map.Entry<Integer, Integer> entry: testMap.entrySet()){
            System.out.println(entry.getKey() + " – liczba wystąpień: " + entry.getValue());
        }
    }
}
