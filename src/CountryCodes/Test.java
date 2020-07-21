package CountryCodes;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, Country> hashMapOfCountries = new HashMap<>();
        ReadFromFileToMap.fromFileToMap(hashMapOfCountries);
        CountryInfoToUser.fromUser(hashMapOfCountries);
    }
}
