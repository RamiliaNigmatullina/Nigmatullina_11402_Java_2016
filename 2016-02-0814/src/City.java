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

    public void setName(String city) {
        this.name = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void getCountry() {
        System.out.println(name + " is located in " + country);
    }

    public void getPopulation() {
        System.out.println("The population is " + population);
    }
}
