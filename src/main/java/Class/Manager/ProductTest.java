package Class.Manager; /**
 * Created by danzygmund-felt on 5/1/17.
 */
import Class.Manager.Product;
import org.junit.*;

public class ProductTest {

    @Test
    public void printProductTest() {
        //Given
        Product product = new Product(0, 10.00, 81);
        String expected = "ProductID: 0\nPrice: $10.00\nQuantity: 81\n";
        //When
        String actual = product.printProduct();
        //Then
        Assert.assertEquals(expected, actual);
    }

}
