package Task007.Classes;

public class Paper {
    String paperQuality;
    String size;
    String color;

    public Paper() {
    }

    public Paper(String color, String paperQuality, String size) {
        this.color = color;
        this.paperQuality = paperQuality;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "It's a simple piece of paper.";
    }
}
