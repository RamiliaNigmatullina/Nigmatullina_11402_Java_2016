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

    public void setAwards(ArrayList<String> awards) {
        this.awards = awards;
    }

    public void getTheatre() {
        System.out.println(name + " is working in " + theatre.getName());
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public void getStyle() {
        System.out.println(name + " dances in the following styles: " + styles);
    }

    public void setStyles(ArrayList<String> styles) {
        this.styles = styles;
    }

    // полиморфизм
    @Override
    public void move() {
        System.out.println("I move smoothly and beautifully.");
    }
}
