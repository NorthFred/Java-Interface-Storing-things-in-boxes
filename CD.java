
public class CD implements ToBeStored {

    // Attributes
    private String artist;
    private String title;
    private int publishingyear;
    private double weight;
    
    private final double WEIGHT = 0.1;
    

    // Constructor
    public CD(String artist, String title, int publishingyear) {
        this.artist = artist;
        this.title = title;
        this.publishingyear = publishingyear;
        this.weight = WEIGHT;
    }

    @Override
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.title + "(" + this.publishingyear + ")";
    }
    
    
}
