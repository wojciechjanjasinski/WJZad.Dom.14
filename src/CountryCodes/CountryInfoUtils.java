package CountryCodes;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static CountryCodes.CountryMapReader.fromFileToMap;

public class CountryInfoUtils {
    public static void displayCountryInfo() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Szanowny Użytkowniku! Podaj proszę kod państwa o którym chciałbyś wyświetlić informację");
        String messageFromUser = scanner.next();
        System.out.println("Wybrałeś: " + messageFromUser);
        Country countryChosenByUser = fromFileToMap().get(messageFromUser);
        System.out.println(countryChosenByUser);
    }
}
