package Task007.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Theatre {
    @Value("Казанский академический русский большой драматический театр имени В. И. Качалова")
    String name;

    @Value("http://www.teatrkachalov.ru/")
    String website;

    @Autowired
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
