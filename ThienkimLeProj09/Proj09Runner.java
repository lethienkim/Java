public class Proj09Runner {
    private byte valA;  // Instance variable

    // Constructor
    public Proj09Runner(byte valA) {
        this.valA = valA;
        displayName(); // Display the user's name upon object creation
    }

    // Overriding the toString method
    @Override
    public String toString() {
        return "Class Proj09Runner " + valA;
    }

    // Method to display the user's name
    private void displayName() {
        System.out.println("\nI certify that this program is my own work");
        System.out.println("and is not the work of others. I agree not");
        System.out.println("to share my solution with others.");
        System.out.println("Thienkim Le\n");
    }
}
