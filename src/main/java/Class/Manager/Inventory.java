package Class.Manager;
/**
 * Created by danzygmund-felt on 5/1/17.
 */
import java.util.*;

public class Inventory {
    private int nextID = 0;
    private int removed = 0;
    private ArrayList<Product> productList = new ArrayList<Product>();

    public int numberOfProducts() {
        return productList.size() - removed;
    }

    public double totalInventoryValue() {
        double value = 0.0;
        for(Product p : productList) {
            value += p.getPrice() * p.getProductQuantity();
        }
        return value;
    }

    public void createNewProduct(double price) {
        Product product = new Product(this.nextID, price, 0);
        productList.add(product);
        this.nextID++;
    }

    public void createNewProduct(double price, int productQuantity) {
        Product product = new Product(this.nextID, price, productQuantity);
        productList.add(product);
        this.nextID++;
    }

    public void changePrice(int productID, double price) {
        productList.get(productID).setPrice(price);
    }

    public void changeQuantity(int productID, int quantity) {
        productList.get(productID).setProductQuantity(quantity);
    }

    public double getPrice(int productID) {
        return productList.get(productID).getPrice();
    }

    public int getProductQuantity(int productID) {
        return productList.get(productID).getProductQuantity();
    }

    public String printInventory() {
        String inventoryString = "";
        for(Product p : productList) {
            inventoryString += p.printProduct() + "\n";
        }
        return inventoryString;
    }

    public void removeProduct(int productID) {
        changePrice(productID, 0);
        changeQuantity(productID, 0);
        removed++;
    }

}
