public class Smartphone {
    // Attributes
    int modelId;          // Unique identifier for the smartphone model
    String modelName;     // Name of the smartphone model
    String companyName;   // Company that makes the smartphone
    int batteryCapacity;   // Battery capacity in mAh

    // Constructor to initialize the smartphone attributes
    public Smartphone(int modelId, String modelName, String companyName, int batteryCapacity) {
        this.modelId = modelId;
        this.modelName = modelName;
        this.companyName = companyName;
        this.batteryCapacity = batteryCapacity;
    }

    // Method to display smartphone data
    public void displayData() {
        System.out.println("Model ID: " + modelId);
        System.out.println("Model Name: " + modelName);
        System.out.println("Company Name: " + companyName);
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
    }

    // Method to simulate making a call
    public void makeCall(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + " from " + modelName);
    }

    public static void main(String[] args) {
        // Create a smartphone object
        Smartphone myPhone = new Smartphone(1, "iPhone 14", "Apple", 3279);
        
        // Display smartphone data
        myPhone.displayData();
        
        // Make a call
        myPhone.makeCall("123-456-7890");
    }
}
