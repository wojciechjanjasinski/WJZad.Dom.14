package CountingTheOccurencesOfNumbers;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {
    public static List<Integer> convertStringListToInteger (List<String> listOfStrings){
        List<Integer> numbers = new ArrayList<>();
        for (String strings: listOfStrings){
            numbers.add(Integer.parseInt(strings));
        }
        return numbers;
    }



    //    public static <T, U> List<U> convertStringListToInteger(List<T> listOfStrings, Function<T, U> function) {
//        return listOfStrings.stream().map(function).collect(Collectors.toList());
//    }
}
