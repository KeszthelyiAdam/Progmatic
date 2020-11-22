package TesztNov;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WorldStatistics {

    public static HashMap<String, Country> countryHashMap = new HashMap<>();
    public static ArrayList<Country> countryArrayList = new ArrayList<>();
    public static String pathCountry = "orszagok.txt", pathCity = "varosok.txt";

    private static Scanner scanCountry;
    private static Scanner scanCity;
    private static String countryCode, countryName, continent, region, leaderName;
    private static double territory, population;
    private static int independenceDate;


    static {
        try {
            scanCountry = new Scanner(new File(pathCountry));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static {
        try {
            scanCity = new Scanner(new File(pathCity));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public WorldStatistics() throws FileNotFoundException {
    }



    public static void main(String[] args) throws FileNotFoundException {


        System.out.println("Country File check: " + (checkCountriesRowInFile() ? "OK" : " NOT OK"));
        System.out.println("City File check: " + (checkCitiesRowInFile() ? "OK" : "NOT OK"));
        readFilesToHashMap();
        readFiletoArrayList();
        System.out.println("Country File check: " + (checkCountriesRowInFile() ? "OK" : " NOT OK"));
        System.out.println("City File check: " + (checkCitiesRowInFile() ? "OK" : "NOT OK"));


        for (Country country : countryArrayList) {
            System.out.println(country);
            System.out.println("Population density: " + country.getCountryCode() + " " + country.getPopulationDensity(country.getCountryCode()));
        }
    }

    private static boolean checkCitiesRowInFile() {
        boolean isItCorrect = true;

        while (scanCity.hasNextLine()) {
            String[] split = scanCity.nextLine().split(",");
            if (split.length < 3) {
                isItCorrect = false;
            }
            checkDataInRow(split, 3);
        }
        return isItCorrect;
    }

    public static boolean checkCountriesRowInFile() {
        boolean isItCorrect = true;

        while (scanCountry.hasNextLine()) {
            String[] split = scanCountry.nextLine().split(",");
            if (split.length < 8) {
                isItCorrect = false;
            }
            checkDataInRow(split, 8);
        }
        return isItCorrect;
    }

    private static void checkDataInRow(String[] split, int length) {


        for (int idx = 0; idx < split.length; idx++) {
            if (split[idx].contains("NULL")) {
                System.out.println("NULL ");
            }
            if (split[idx].substring(0, 1).equals("-")) {
                System.out.println("Mínusz szám ");
            }
            if (split.length != length) {
                System.out.println("Length: " + split.length);
            }

        }
    }

    public static void readFilesToHashMap() {
        while (scanCountry.hasNextLine()) {
            String[] split = scanCountry.nextLine().split(",");
            countryHashMap.put(countryCode, fillCountryDatas(split));
        }

        while (scanCity.hasNextLine()) {
            String[] split = scanCity.nextLine().split(",");
            String countryCode = split[1];
            String cityName = split[0];
            double cityPopulation = Double.parseDouble(split[2]);

            City city = new City(cityName, countryCode, cityPopulation);
            countryHashMap.get(countryCode).getCities().add(city);
            System.out.println("Country: "+ countryHashMap.get(countryCode));
        }
    }

    public static void readFiletoArrayList() throws FileNotFoundException {

        while (scanCountry.hasNextLine()) {
            String[] split = scanCountry.nextLine().split(",");
            countryArrayList.add(fillCountryDatas(split));
        }
    }

    public static Country fillCountryDatas(String[] split) {
        countryCode = split[0];
        countryName = split[1];
        continent = split[2];
        region = split[3];
        territory = Double.parseDouble(split[4].substring(0, split[4].length() - 3));
        if (split[5].contains("NULL")) {
            independenceDate = 0;
        } else if (split[5].substring(0, 1).contains("-")) {
            independenceDate = -1;
        } else {
            independenceDate = Integer.parseInt(split[5]);
        }
        population = Double.parseDouble(split[6]);
        if (split.length == 7) {
            leaderName = split[7];
        } else {
            leaderName = "-";
        }

        Country country = new Country(countryCode,
                countryName,
                continent,
                region,
                territory,
                independenceDate,
                population,
                leaderName,
                null);

        return country;
    }
    // 9. Melyik ország nyerte el legkésőbb (a nyilvántartás szerint) a függetlenségét? Add vissza a megfelelő országkódot, a metódus szignatúrája
    // az alábbi legyen: public String lastIndependentCountry()

    public String lastIndependentCountry() {
        int freedom = 0;
        String freeCountry = "";

        for (Country country : countryArrayList) {
            if (country.getDateFreedom() > freedom) {
                freedom = country.getDateFreedom();
                freeCountry = country.getNameOfCountry();
            }
        }
        return freeCountry;
    }
    // 8. Melyik betűvel kezdődik a legtöbb országkód? A visszatérési érték egy egybetűs String, a metódus szignatúrája pedig az alábbi legyen:
    //    public String getPopularFirstLetter()   Egy hosszabb String első betűjének visszakapására a .substring() metódus használatos.


    public String getPopularFirstLetter() {
        HashMap<String, Integer> letterHashMap = new HashMap<>();
        String letter = "";

        for (Country country : countryArrayList) {
            letter = country.getCountryCode().substring(0, 1);

            int i;

            letterHashMap.putIfAbsent(letter, 1);
            letterHashMap.put(letter, letterHashMap.get(letter) + 1);

        }


        return letter;
    }


    // 6. Írj egy olyan metódust, amely visszaadja egy paraméterül kapott ország városainak a neveit (az országot országkóddal adjuk meg)!
    // A metódus szignatúrája az alábbi legyen: public HashSet<String> getCitiesOfCountry(String countryCode)

    // 7. Hány országnak az államfőjének nevében szerepel “Hamad” vagy “Ahmad” vagy “Ahmed”? A metódus szignatúrája az alábbi legyen:
    //    public int getAhmedCount()
    //    Egy String objektumban a .indexOf() metódussal tudod megvizsgálni, hogy tartalmaz-e egy adott karaktersorozatot.
    public int getAhmedCount() {
        int counter = 0;

        for (Country country : countryArrayList) {
            if (country.getLeaderName().contains("Hamad")) {
                counter++;
            }
            if (country.getLeaderName().contains("Ahmad")) {
                counter++;
            }
            if (country.getLeaderName().contains("Ahmed")) {
                counter++;
            }
        }
        return counter;
    }

    // 5. Írj egy olyan metódust, amely visszaadja egy paraméterül kapott kontinens országainak az országkódjait!
    // A metódus szignatúrája az alábbi legyen: public ArrayList<String> getCountriesOfContinent(String continentName)

    public HashSet<String> getCitiesOfCountry(String countryCode) {
        HashSet<String> citiesOfCountry = new HashSet<>();
        Iterator<City> iterator = countryHashMap.get(countryCode).getCities().iterator();

        while (iterator.hasNext()) {
            citiesOfCountry.add(iterator.next().getCityName());
        }

        return citiesOfCountry;
    }


    // 4. Írj egy olyan metódust, ami országkód alapján visszaadja egy ország összes adatát! A metódus szignatúrája a
    //    alábbi legyen:   public Country findCountryByISoCode(String isoCode)

    public ArrayList<String> getCountriesOfContinent(String continentName) {
        ArrayList<String> countryStringList = new ArrayList<>();

        for (Country country : countryArrayList) {
            if (country.getContinent().equals(continentName)) {
                countryStringList.add(country.getCountryCode());
            }
        }

        return countryStringList;
    }

    public Country findCountryByISoCode(String isoCode) {
        Country country = countryHashMap.get(isoCode);
        return country;
    }


}
