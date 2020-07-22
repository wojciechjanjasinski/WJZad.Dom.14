package CountryCodes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class CountryMapReader {
    static String fileName = "CountriesInfo.csv";
    public static HashMap<String, Country> fromFileToMap() throws FileNotFoundException {
        HashMap<String, Country> hashMapOfCountries = new HashMap<>();
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine()){
            String[] columns = scanner.nextLine().split(";");
            double numberOfCitizens = Double.parseDouble(columns[2]);
            hashMapOfCountries.put(columns[0], new Country(columns[0], columns[1], numberOfCitizens));
        }
        return hashMapOfCountries;
    }
}
