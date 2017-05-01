package Class.Manager;

/**
 * Created by danzygmund-felt on 5/1/17.
 */
public class Manager {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        inventory.createNewProduct(45.00, 30);
        inventory.createNewProduct(180.20);
        inventory.createNewProduct(325, 7);
        inventory.createNewProduct(4000, 1);

        System.out.println(inventory.printInventory());
        System.out.println(inventory.numberOfProducts() + " products in inventory.\n");

        inventory.removeProduct(1);

        System.out.println(inventory.printInventory());
        System.out.println(inventory.numberOfProducts() + " products in inventory.\n");

        inventory.changePrice(0, 12.00);
        inventory.changeQuantity(3, 10);

        System.out.println(inventory.printInventory());
        System.out.println(inventory.numberOfProducts() + " products in inventory.\n");
    }

}
