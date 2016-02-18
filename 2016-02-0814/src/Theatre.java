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

    public void setName(String name) {
        this.name = name;
    }

    public void getWebsite() {
        System.out.println("Website is " + website);
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void getCity() {
        System.out.println(this.name + " is located in " + this.city.getName());
    }

    public void setCity(City city) {
        this.city = city;
    }
}
