import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Electronics_testcase extends BaseTest{

    @Test
    public void ElectronicsPage() throws InterruptedException {

        Electronics_po OBJ=new Electronics_po(driver);

        OBJ.HoverElectronics();
        Thread.sleep(4000);

        OBJ.setSelectProduct();
        Thread.sleep(4000);

       /* OBJ.setDropDowns();
        Thread.sleep(4000);

        OBJ.setDisplay();
        Thread.sleep(4000);*/

        OBJ.setAddtocart();
        Thread.sleep(4000);

        OBJ.ShoppingCart();
        Thread.sleep(4000);

    }
}
