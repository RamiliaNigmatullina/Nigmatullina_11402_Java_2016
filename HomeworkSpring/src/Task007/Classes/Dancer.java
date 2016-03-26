package Task007.Classes;

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

    public void getAwards() {
        System.out.println(name + " has the following awards: ");
        int n = 0;
        for (String award : awards) {
            n++;
            System.out.println(n + ". " + award);
        }
    }

    public void getTheatre() {
        System.out.println(name + " is working in " + theatre.getName());
    }

    public void getStyle() {
        System.out.println(name + " dances in the following styles: ");
        int n = 0;
        for (String style : styles) {
            n++;
            System.out.println(n + ". " + style);
        }
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
