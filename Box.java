import java.util.*;

public class Box implements ToBeStored {

    // Attributes    
    private int maximumcapacityKG;
    private int amount;
    private int weight;
    
    // Store the ToBeStored objects in the Box as a list.
    private List<ToBeStored> thingsInTheBox;
    
    // Constructor
    public Box (int maximumweight) {
        // Initialize a list to hold the objects 'ToBeStored'
        this.thingsInTheBox = new ArrayList<ToBeStored>();
        this.maximumcapacityKG = maximumweight;
        this.weight = 0;                            // When creating the box, it is empty.
    }
    
    // "add" method can add books and CDs == ToBeStored objects.
    // ToBeStored interface is implemented by both Books and CDs.
    public void add (ToBeStored thing) {
        // Only add more books, if the max weight has not been exceeded.
        if (this.weight <= this.maximumcapacityKG) {
            this.thingsInTheBox.add(thing);
            this.weight += thing.weight();      // Add the weight of the thing to the total weight
            this.amount += 1;                   // Increase thing/object amount by one.
        }
    }
    
    public void thingsInTheBox() {
        // Things can be printed, because they have a ToString method
        // and they belong to the class CD and Book!
        
        for (ToBeStored thing : this.thingsInTheBox) {
            System.out.println(thing);
        }   
    }
    
    //@Override
    //public double weight() {
    //    return this.weight;
    //}
    
    @Override
    public double weight() {
        // Replacing the double weight method from above with a weight calculator.
        // This will give more accurate results, with less rounding errors.
        double totalweight = 0;
        for (ToBeStored thing: this.thingsInTheBox) {
            totalweight += thing.weight();
        }
        return Math.round(totalweight);
    }
    
    @Override
    public String toString() {
        return "Box: " + this.amount + " things, total weight: " + weight() + " kg";
    }
}
