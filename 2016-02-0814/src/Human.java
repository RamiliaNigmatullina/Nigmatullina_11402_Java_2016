public class Human implements HumanActions {
    String name;
    City city;
    String dateOfBirth;

    public Human() {
    }

    public Human(String name, City city, String dateOfBirth) {
        this.name = name;
        this.city = city;
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void getCity() {
        System.out.println(name + " is from " + city.name);
    }

    public void getAge() {
        System.out.println(name + "'s birthday " + dateOfBirth);
    }

    @Override
    public void move() {
        System.out.println("I'm moving.");
    }

    @Override
    public void speak() {
        System.out.println("Hey!");
    }

    @Override
    public void think() {
        System.out.println("Hmm, I wonder, what if ..");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating");
    }
}
