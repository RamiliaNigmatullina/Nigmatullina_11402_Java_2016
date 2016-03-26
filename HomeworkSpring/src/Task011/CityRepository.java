package Task011;

import java.util.ArrayList;

public class CityRepository {
    private ArrayList<City> cities;

    public CityRepository(ArrayList<City> cities) {
        this.cities = cities;
    }

    public ArrayList<City> getCities() {
        return cities;
    }
}