
public class TestBoxInsideBox {
 
    
    // Interface = "ToBeStored"
    // Books and CDs are of the same type "ToBeStored", because they implement the class
    // Boxes are also of the "ToBeStored" type
    // Next, we will test what happens if we put a box inside a box
    
    public static void main(String[] args) {
        
        Box smallbox = new Box(10);
        Box anothersmallbox = new Box(10);
        Box largebox = new Box(100);
        Box movingVan = new Box(1000);
        
        smallbox.add ( new Book ("John H. Johnson", "How to fix your car", 2));
        anothersmallbox.add ( new CD ("Pantera", "Vulgar display of power", 1998));
        
        largebox.add(smallbox);
        largebox.add(anothersmallbox);
        
        System.out.println("Checking the weight of the large box");
        System.out.println("The large box contains 2 small boxes");
        System.out.println("Total weight is 2.1 kg of things.");
        
        System.out.println("Small box:");
        System.out.println(smallbox);
        System.out.println("Another small box:");
        System.out.println(anothersmallbox);
        System.out.println("Large box:");
        System.out.println(largebox);
        
        System.out.println("Things in the largebox:");
        largebox.thingsInTheBox();
        
        System.out.println("Putting a box inside a box:");
        System.out.println("THIS WILL THROW A StackOverflowError!");
        smallbox.add(smallbox);
        smallbox.weight();
        smallbox.thingsInTheBox();
    }   
}
