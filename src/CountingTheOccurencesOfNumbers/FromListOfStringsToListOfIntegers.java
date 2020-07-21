package CountingTheOccurencesOfNumbers;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class FromListOfStringsToListOfIntegers {
    public static List<Integer> transformFromListOfStringsToListOfIntegers() throws IOException {
        List<String> testList = Files.readAllLines(new File("Numbers.txt").toPath(), Charset.defaultCharset());
        return ConvertListStringToInteger.convertStringListToInteger(testList, Integer::parseInt);
    }
}
