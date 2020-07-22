package CountingTheOccurencesOfNumbers;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class NumbersReader {
    public static List<Integer> transformFromListOfStringsToListOfIntegers() throws IOException {
        List<String> testList = Files.readAllLines(new File("Numbers.txt").toPath(), Charset.defaultCharset());
        return ListUtils.convertStringListToInteger(testList);
    }
}
