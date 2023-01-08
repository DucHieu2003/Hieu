package Exercises1_5;

import java.util.ArrayList;

public class CountryArrayManager {
    private Country[] list;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        list = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        list = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.list;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.list.length; i++) {
                this.list[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.list.length + this.increment];
        System.arraycopy(this.list, 0, newArray, 0, this.list.length);
        this.list = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.list.length) {
            allocateMore();
        }

        this.list[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.list.length)) {
            return false;
        }

        if (this.length >= this.list.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.list[i] = this.list[i - 1];
        }

        this.list[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= list.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.list[i] = this.list[i + 1];
        }

        this.list[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.list[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.list, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[i].getPopulation()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.list, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int jIndex = i + 1; jIndex < newArray.length; jIndex++) {
                if (newArray[i].getPopulation() < newArray[jIndex].getPopulation()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[jIndex];
                    newArray[jIndex] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.list, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray.length - 1 - i; j++) {
                if (newArray[j].getArea() > newArray[j + 1].getArea()) {
                    Country temp = newArray[j + 1];
                    newArray[j + 1] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.list, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray.length - 1 - i; j++) {
                if (newArray[j].getArea() < newArray[j + 1].getArea()) {
                    Country temp = newArray[j + 1];
                    newArray[j + 1] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.list, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length; i++) {
            Country temp = newArray[i];
            for (int j = i - 1; j >= 0; j--) {
                if (newArray[j].getGdp() > temp.getGdp()) {
                    newArray[j + 1] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.list, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length; i++) {
            Country temp = newArray[i];
            for (int j = i - 1; j >= 0; j--) {
                if (newArray[j].getGdp() < temp.getGdp()) {
                    newArray[j + 1] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        ArrayList<AfricaCountry> result = new ArrayList<AfricaCountry>();
        for (int i = 0; i < list.length; i++) {
            if (list[i] instanceof AfricaCountry) {
                result.add((AfricaCountry) list[i]);
            }
        }
        AfricaCountry[] newArray = result.toArray(new AfricaCountry[0]);
        if (newArray.length > 0) {
            return newArray;
        }
        return null;
    }

    public AsiaCountry[] filterAsiaCountry() {
        ArrayList<AsiaCountry> result = new ArrayList<AsiaCountry>();
        for (int i = 0; i < list.length; i++) {
            if (list[i] instanceof AsiaCountry) {
                result.add((AsiaCountry) list[i]);
            }
        }
        AsiaCountry[] newArray = result.toArray(new AsiaCountry[0]);
        if (newArray.length > 0) {
            return newArray;
        }
        return null;
    }

    public EuropeCountry[] filterEuropeCountry() {
        ArrayList<EuropeCountry> result = new ArrayList<EuropeCountry>();
        for (int i = 0; i < list.length; i++) {
            if (list[i] instanceof EuropeCountry) {
                result.add((EuropeCountry) list[i]);
            }
        }
        EuropeCountry[] newArray = result.toArray(new EuropeCountry[0]);
        if (newArray.length > 0) {
            return newArray;
        }
        return null;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        ArrayList<NorthAmericaCountry> result = new ArrayList<NorthAmericaCountry>();
        for (int i = 0; i < list.length; i++) {
            if (list[i] instanceof NorthAmericaCountry) {
                result.add((NorthAmericaCountry) list[i]);
            }
        }
        NorthAmericaCountry[] newArray = result.toArray(new NorthAmericaCountry[0]);
        if (newArray.length > 0) {
            return newArray;
        }
        return null;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        ArrayList<OceaniaCountry> result = new ArrayList<OceaniaCountry>();
        for (int i = 0; i < list.length; i++) {
            if (list[i] instanceof OceaniaCountry) {
                result.add((OceaniaCountry) list[i]);
            }
        }
        OceaniaCountry[] newArray = result.toArray(new OceaniaCountry[0]);
        if (newArray.length > 0) {
            return newArray;
        }
        return null;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        ArrayList<SouthAmericaCountry> result = new ArrayList<SouthAmericaCountry>();
        for (int i = 0; i < list.length; i++) {
            if (list[i] instanceof SouthAmericaCountry) {
                result.add((SouthAmericaCountry) list[i]);
            }
        }
        SouthAmericaCountry[] newArray = result.toArray(new SouthAmericaCountry[0]);
        if (newArray.length > 0) {
            return newArray;
        }
        return null;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] list = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            list[i] = sortByDecreasingPopulation()[i];
        }
        return list;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] list = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            list[i] = sortByIncreasingPopulation()[i];
        }
        return list;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] list = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            list[i] = sortByDecreasingArea()[i];
        }
        return list;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] list = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            list[i] = sortByIncreasingArea()[i];
        }
        return list;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] list = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            list[i] = sortByDecreasingGdp()[i];
        }
        return list;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] list = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            list[i] = sortByIncreasingGdp()[i];
        }
        return list;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.println(countriesString.toString().trim() + "]");
    }
}

