package CountryCodes;

import java.io.FileNotFoundException;


import static CountryCodes.CountryInfoUtils.displayCountryInfo;
import static CountryCodes.CountryMapReader.fromFileToMap;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        displayCountryInfo(new StringsCountry());
    }
}
