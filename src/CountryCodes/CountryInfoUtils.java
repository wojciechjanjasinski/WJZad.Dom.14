package CountryCodes;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

import static CountryCodes.CountryMapReader.*;

public class CountryInfoUtils {
    public static void displayCountryInfo() throws FileNotFoundException {
        Map<String, Country> hashMapOfCountries = fromFileToMap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Szanowny Użytkowniku! Podaj proszę kod państwa o którym chciałbyś wyświetlić informację");
        String messageFromUser = scanner.next();
        System.out.println("Wybrałeś: " + messageFromUser);
        Country countryChosenByUser = hashMapOfCountries.get(messageFromUser);
        System.out.println(countryChosenByUser);
    }
}
