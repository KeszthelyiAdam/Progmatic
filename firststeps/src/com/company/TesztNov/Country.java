package TesztNov;

import java.util.ArrayList;
import java.util.Iterator;

public class Country {

    private String countryCode;
    private String nameOfCountry;
    private String continent;
    private String region;
    private double territory;
    private int dateFreedom;
    private double countryPopulation;
    private String leaderName;
    private ArrayList<City> cities;

    public Country() {
    }

    public Country(String countryCode, String nameOfCountry, String continent, String region, double territory, int dateFreedom,
                   double countryPopulation, String leaderName, ArrayList<City> cities) {
        this.countryCode = countryCode;
        this.nameOfCountry = nameOfCountry;
        this.continent = continent;
        this.region = region;
        this.territory = territory;
        this.dateFreedom = dateFreedom;
        this.countryPopulation = countryPopulation;
        this.leaderName = leaderName;
        this.cities = cities;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getTerritory() {
        return territory;
    }

    public void setTerritory(double territory) {
        this.territory = territory;
    }

    public int getDateFreedom() {
        return dateFreedom;
    }

    public void setDateFreedom(int dateFreedom) {
        this.dateFreedom = dateFreedom;
    }

    public double getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(double countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryCode='" + countryCode + '\'' +
                ", nameOfCountry='" + nameOfCountry + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", territory=" + territory +
                ", dateFreedom=" + dateFreedom +
                ", countryPopulation=" + countryPopulation +
                ", leaderName='" + leaderName + '\'' +
                ", cities=" + cities +
                '}';
    }
    // 2. A Country osztályba írj egy public double getPopulationDensity()  metódust,
    // ami visszaadja az adott ország népsűrűségét fő/km2-ben! Ha az ország területe vagy népessége nincs megadva,
    // akkor metódusod -1-gyel térjen vissza!

    public double getPopulationDensity(String countryCode) {
        Country country = WorldStatistics.countryHashMap.get(countryCode);
        if ((this.getCountryPopulation() > 0) && (this.getTerritory() > 0)) {
            double popDensity = this.getCountryPopulation() / this.getTerritory();

            return popDensity;
        } else {
            return -1;
        }
    }

    // 3. A Country osztályba írj egy  public double getRuralPopulation() metódust, ami visszaadja,
    // hogy az adott országban hány fő él a felsorolt városokon kívül!

    public double getRuralPopulation() {
        double ruralPop, cityPop = 0;

        Iterator<City> iterator = this.getCities().iterator();
        while (iterator.hasNext()) {
            cityPop += iterator.next().getCityPopulation();
        }

        ruralPop = this.getCountryPopulation() - cityPop;
        return ruralPop;
    }


}
