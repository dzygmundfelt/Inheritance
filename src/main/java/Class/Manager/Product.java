package Class.Manager;

/**
 * Created by danzygmund-felt on 5/1/17.
 */
public class Product {

    private int productID;
    private double price;
    private int productQuantity;

    public Product(int productID, double price, int productQuantity) {
        this.productID = productID;
        this.price = price;
        this.productQuantity = productQuantity;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String printProduct() {
        String priceInDollars = String.format("%.2f", this.price);
        return "ProductID: " + this.productID + "\n" +
                "Price: $" + priceInDollars + "\n" +
                "Quantity: " + this.productQuantity + "\n";
    }
}
