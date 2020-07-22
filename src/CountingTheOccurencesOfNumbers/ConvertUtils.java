package CountingTheOccurencesOfNumbers;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ConvertUtils {
    public static void convertIntegerList(Map<Integer, Integer> testMap) throws IOException {
        List<Integer> integerTestList = NumbersReader.transformFromListOfStringsToListOfIntegers();
        for (Integer numbersToGetConverted : integerTestList) {
            Integer count = testMap.get(numbersToGetConverted);
            if (count == null)
                count = 0;
            testMap.put(numbersToGetConverted, count + 1);
        }
    }
}


