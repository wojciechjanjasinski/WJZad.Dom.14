package CountingTheOccurencesOfNumbers;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static CountingTheOccurencesOfNumbers.ConvertUtils.convertIntegerList;

public class Test {
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> testMap = new TreeMap<>();
        convertIntegerList(testMap);
        for (Map.Entry<Integer, Integer> entry : testMap.entrySet()) {
            System.out.println(entry.getKey() + " – liczba wystąpień: " + entry.getValue());
        }
    }


}


