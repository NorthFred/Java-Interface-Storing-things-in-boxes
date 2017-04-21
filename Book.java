
public class Book implements ToBeStored {

    // Attributes
    private String writer;
    private String name;
    private double weight;

    // Constructor
    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.writer + ": " + this.name;
    }
    
}
