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

    public void setSize(String size) {
        this.size = size;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
