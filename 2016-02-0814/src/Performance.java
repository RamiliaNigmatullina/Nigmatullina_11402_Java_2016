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

    public void setName(String name) {
        this.name = name;
    }

    public void getTheatre() {
        System.out.println("This performance takes place in the theater " + theatre.name);
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public void getDescription() {
        System.out.println("Decription: "+ description);
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
