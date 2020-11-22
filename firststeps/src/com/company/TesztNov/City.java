package TesztNov;

public class City {

    private String cityName;
    private String countryCode;
    private double cityPopulation;

    public City() {
    }

    public City(String cityName, String countryCode, double cityPopulation) {
        this.cityName = cityName;
        this.countryCode = countryCode;
        this.cityPopulation = cityPopulation;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public double getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(double cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", cityPopulation=" + cityPopulation +
                '}';
    }

    // Bónusz A City osztályba írj egy
    // public double getPopulationPercentage()
    // metódust, ami visszaadja, hogy az adott város populációja hány százaléka az anyaország populációjának! Ha akár a város,
    // akár az anyaország populációja nincs megadva, a metódusod -1-gyel térjen vissza!

    public double getPopulationPercentage() {

        return this.getCityPopulation() / (WorldStatistics.countryHashMap.get(this.countryCode).getPopulationDensity(this.countryCode));
    }

}


