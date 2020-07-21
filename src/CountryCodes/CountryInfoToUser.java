package CountryCodes;

import java.util.HashMap;
import java.util.Scanner;

public class CountryInfoToUser {
    public static void fromUser (HashMap<String, Country> hashMapFromUser){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Szanowny Użytkowniku! Podaj proszę kod państwa o którym chciałbyś wyświetlić informację");
        String messageFromUser = scanner.next();
        System.out.println("Wybrałeś: " + messageFromUser);
        Country countryChosenByUser = hashMapFromUser.get(messageFromUser);
        System.out.println(countryChosenByUser);
    }
}
