package CountryCodes;

import java.io.FileNotFoundException;
import java.util.Map;

import static CountryCodes.CountryInfoUtils.displayCountryInfo;
import static CountryCodes.CountryMapReader.fromFileToMap;

public class StringsCountry {
    public Map<String, Country> StringsCountry() throws FileNotFoundException {
        Map<String, Country> stringCountryMap = fromFileToMap();{
            displayCountryInfo(stringCountryMap);
        }
        return stringCountryMap;
    }
}
