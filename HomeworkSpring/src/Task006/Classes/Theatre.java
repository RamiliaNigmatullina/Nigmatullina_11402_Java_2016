package Task006.Classes;

public class Theatre {
    String name;
    String website;
    City city;

    public Theatre() {
    }

    public Theatre(String name, String website, City city) {
        this.name = name;
        this.website = website;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void getWebsite() {
        System.out.println("Website is " + website);
    }

    public void getCity() {
        System.out.println(this.name + " is located in " + this.city.getName());
    }

    @Override
    public String toString() {
        return name;
    }
}
