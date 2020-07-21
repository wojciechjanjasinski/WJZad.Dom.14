package CountryCodes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class ReadFromFileToMap {
    static String fileName = "CountriesInfo.csv";
    public static void fromFileToMap(HashMap<String, Country> hashMapFromUser) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine()){
            String[] columns = scanner.nextLine().split(";");
            double numberOfCitizens = Double.parseDouble(columns[2]);
            hashMapFromUser.put(columns[0], new Country(columns[0], columns[1], numberOfCitizens));
        }
        System.out.println(hashMapFromUser);
    }
}
