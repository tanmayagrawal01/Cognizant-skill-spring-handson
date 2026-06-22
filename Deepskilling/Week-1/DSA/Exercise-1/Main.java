public class Main {
    public static void main(String[] args) {
        InventorySystem warehouse = new InventorySystem();

        // Adding some dummy data to test the system
        warehouse.addProduct(new Product("P101", "Gaming Laptop", 10, 1200.50));
        warehouse.addProduct(new Product("P102", "Mechanical Keyboard", 45, 80.00));
        warehouse.addProduct(new Product("P103", "Wireless Mouse", 100, 25.99));

        warehouse.displayAll();

        // Testing the update method
        System.out.println(">> Updating Keyboard stock...");
        warehouse.updateProduct("P102", 40, 75.00);

        // Testing the delete method
        System.out.println(">> Deleting Mouse...");
        warehouse.deleteProduct("P103");

        // Final check to see the output
        warehouse.displayAll();
    }
}