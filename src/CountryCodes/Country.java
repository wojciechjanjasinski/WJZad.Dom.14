package CountryCodes;

import java.util.Objects;

public class Country {
    private String codeCountry;
    private String nameCountry;
    private double citizensNumber;

    public Country(String codeCountry, String nameCountry, double citizensNumber) {
        this.codeCountry = codeCountry;
        this.nameCountry = nameCountry;
        this.citizensNumber = citizensNumber;
    }

    public String getCodeCountry() {
        return codeCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public double getCitizensNumber() {
        return citizensNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Double.compare(country.citizensNumber, citizensNumber) == 0 &&
                codeCountry.equals(country.codeCountry) &&
                nameCountry.equals(country.nameCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeCountry, nameCountry, citizensNumber);
    }

    @Override
    public String toString() {
        return "Country{" +
                "codeCountry='" + codeCountry + '\'' +
                ", nameCountry='" + nameCountry + '\'' +
                ", citizensNumber=" + citizensNumber +
                '}';
    }
}
