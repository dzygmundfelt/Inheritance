package Class.Manager.Test; /**
 * Created by danzygmund-felt on 5/1/17.
 */
import Class.Manager.Inventory;
import org.junit.*;

public class InventoryTest {

    @Test
    public void numberOfProductsTest() {
        //Given
        Inventory inventory = new Inventory();
        inventory.createNewProduct(10.00);
        inventory.createNewProduct(14.55);
        inventory.createNewProduct(8000.00);
        int expected = 3;
        //When
        int actual = inventory.numberOfProducts();
        //Then
        Assert.assertEquals("There are 3 products in inventory", expected, actual);
    }

    @Test
    public void numberOfProductsZeroTest() {
        //Given
        Inventory inventory = new Inventory();
        int expected = 0;
        //When
        int actual = inventory.numberOfProducts();
        //Then
        Assert.assertEquals("There are 0 products in inventory", expected, actual);
    }

    @Test
    public void totalInventoryValueTest() {
        //Given
        Inventory inventory = new Inventory();
        inventory.createNewProduct(10.00, 35);
        inventory.createNewProduct(14.55, 250);
        inventory.createNewProduct(8000.00, 6);
        double expected = 51987.50;
        //When
        double actual = inventory.totalInventoryValue();
        //Then
        Assert.assertEquals("There is $50987.50 of inventory", expected, actual, 0);
    }

    @Test
    public void totalInventoryValueZeroTest() {
        //Given
        Inventory inventory = new Inventory();
        double expected = 0.0;
        //When
        double actual = inventory.totalInventoryValue();
        //Then
        Assert.assertEquals("There is $0.00 of inventory", expected, actual, 0);
    }

    @Test
    public void printInventoryTest() {
        //Given
        Inventory inventory = new Inventory();
        inventory.createNewProduct(10.00, 35);
        inventory.createNewProduct(14.55, 250);
        inventory.createNewProduct(8000.00, 6);
        String expected =
                "ProductID: 0\nPrice: $10.00\nQuantity: 35\n" +
              "\nProductID: 1\nPrice: $14.55\nQuantity: 250\n" +
              "\nProductID: 2\nPrice: $8000.00\nQuantity: 6\n\n";
        //When
        String actual = inventory.printInventory();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void emptyPrintInventoryTest() {
        //Given
        Inventory inventory = new Inventory();
        String expected = "";
        //When
        String actual = inventory.printInventory();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
