package CountryCodes;

import java.util.HashMap;
import java.util.Scanner;

public class ReadFromFileToMap {
    static String fileName = "CountriesInfo.csv";
    public static void fromFileToMap(HashMap<String, Country> hashMapFromUser) {
        Scanner scanner = new Scanner(fileName);
        while (scanner.hasNextLine()){
            String[] columns = scanner.nextLine().split(";");
            double numberOfCitizens = Double.parseDouble(columns[2]);
            hashMapFromUser.put(columns[0], new Country(columns[0], columns[1], numberOfCitizens));
        }
        System.out.println(hashMapFromUser);
    }
}
