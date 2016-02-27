package Classes;

public class City {
    String name;
    String country;
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
