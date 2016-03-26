package Task007.Classes;

public class Performance {
    String name;
    Theatre theatre;
    String description;

    public Performance() {
    }

    public Performance(String name, Theatre theatre, String description) {
        this.name = name;
        this.theatre = theatre;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void getTheatre() {
        System.out.println("This performance takes place in the theater " + theatre.name);
    }

    public void getDescription() {
        System.out.println("Decription: "+ description);
    }

    @Override
    public String toString() {
        return "It is a performance \"" + this.name + "\".";
    }
}
