package CountryCodes;

import java.io.FileNotFoundException;
import java.util.Map;


import static CountryCodes.CountryInfoUtils.displayCountryInfo;
import static CountryCodes.CountryMapReader.fromFileToMap;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Country> stringCountryMap = fromFileToMap();
        displayCountryInfo(stringCountryMap);

    }
}
