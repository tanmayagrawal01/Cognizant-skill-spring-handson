import java.util.HashMap;

public class InventorySystem {
    // Using a HashMap here to get fast O(1) lookups
    private HashMap<String, Product> inventory;

    public InventorySystem() {
        this.inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Error: Product ID already exists!");
        } else {
            inventory.put(product.getProductId(), product);
            System.out.println("Added: " + product.getProductName());
        }
    }

    public void updateProduct(String productId, int newQuantity, double newPrice) {
        if (inventory.containsKey(productId)) {
            Product p = inventory.get(productId);
            p.setQuantity(newQuantity);
            p.setPrice(newPrice);
            System.out.println("Update successful for ID: " + productId);
        } else {
            System.out.println("Item not found!");
        }
    }

    public void deleteProduct(String productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("Item deleted: " + productId);
        } else {
            System.out.println("Item not found, couldn't delete.");
        }
    }

    public void displayAll() {
        System.out.println("\n--- Current Warehouse Inventory ---");
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product p : inventory.values()) {
                System.out.println(p.toString());
            }
        }
        System.out.println("-----------------------------------\n");
    }
}