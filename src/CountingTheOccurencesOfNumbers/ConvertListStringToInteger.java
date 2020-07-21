package CountingTheOccurencesOfNumbers;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListStringToInteger {
    public static <T, U> List<U> convertStringListToInteger(List<T> listOfStrings, Function<T, U> function) {
        return listOfStrings.stream().map(function).collect(Collectors.toList());
    }
}
