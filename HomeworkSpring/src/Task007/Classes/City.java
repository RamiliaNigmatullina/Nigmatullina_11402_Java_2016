package Task007.Classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class City {
    @Value("Казань")
    String name;
    @Value("Россия")
    String country;
    @Value("1216000")
    long population;

    public City() {
    }

    public City(String name, String country, long population)  {
        this.population = population;
        this.country = country;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getCountry() {
        System.out.println(name + " is located in " + country + ".");
    }

    public void getPopulation() {
        System.out.println("The population is " + population + ".");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
