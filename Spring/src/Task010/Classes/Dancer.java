package Task010.Classes;

import java.util.ArrayList;

public class Dancer extends Human {
    ArrayList<String> awards;
    Theatre theatre;
    ArrayList<String> styles;

    public Dancer() {
    }

    public Dancer(String name, City city, String dateOfBirth, ArrayList<String> awards, Theatre theatre, ArrayList<String> styles) {
        super(name, city, dateOfBirth);
        this.awards = awards;
        this.theatre = theatre;
        this.styles = styles;
    }

    public ArrayList<String> getAwards() {
        return awards;
    }

    public void getTheatre() {
        System.out.println(name + " is working in " + theatre.getName());
    }

    public void getStyle() {
        System.out.println(name + " dances in the following styles: " + styles);
    }

    // полиморфизм
    @Override
    public void move() {
        System.out.println("I move smoothly and beautifully.");
    }

    @Override
    public String toString() {
        return "My name is " + this.getName() + ". I'm a dancer.";
    }
}
