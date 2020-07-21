package CountryCodes;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Country> hashMapOfCountries = new HashMap<>();
        ReadFromFileToMap.fromFileToMap(hashMapOfCountries);
    }
}
