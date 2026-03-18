public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("===== Available Room Details =====");

        // Create room objects
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static availability (temporary approach)
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        // Display details
        single.displayDetails();
        System.out.println("Available: " + singleAvailable);
        System.out.println();

        doubleRoom.displayDetails();
        System.out.println("Available: " + doubleAvailable);
        System.out.println();

        suite.displayDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}

// ===== Abstract Room Class =====
abstract class Room {

    protected String type;
    protected double price;

    public Room(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Room Type: " + type);
        System.out.println("Price: ₹" + price);
    }
}

// ===== Concrete Room Classes =====
class SingleRoom extends Room {
    public SingleRoom() {
        super("Single Room", 2000);
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super("Double Room", 3500);
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super("Suite Room", 6000);
    }
}
