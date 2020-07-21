package CountingTheOccurencesOfNumbers;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Integer> integerTestList = FromListOfStringsToListOfIntegers.transformFromListOfStringsToListOfIntegers();
        Map<Integer, Integer> testMap = new TreeMap<>();
        for (Integer numbersToGetConverted : integerTestList) {
            Integer count = testMap.get(numbersToGetConverted);
            if (count == null)
                count = 0;
            testMap.put(numbersToGetConverted, count + 1);
        }
        for (Map.Entry<Integer, Integer> entry : testMap.entrySet()) {
            System.out.println(entry.getKey() + " – liczba wystąpień: " + entry.getValue());
        }
    }
}


