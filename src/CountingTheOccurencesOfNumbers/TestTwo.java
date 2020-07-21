package CountingTheOccurencesOfNumbers;

import CountryCodes.ReadFromFileToMap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TestTwo {
    public static void main(String[] args) throws IOException {
        List<String> stringList = new ArrayList<>();
        Map<Integer, Integer> integerIntegerMap = new TreeMap<>();
        ReadAndConvert.readFromFileToMap(stringList, integerIntegerMap);
    }
}
