import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Electronics_po extends  BaseClass{

    WebDriver driver;

    public Electronics_po(WebDriver driver){

        super(driver);
        this.driver=driver;
    }

    By CellPhone=By.xpath("(//a[text()=\"Cell phones \"])[1]");

    public void HoverElectronics(){
        WebElement HoverToElectronics=driver.findElement(By.xpath("(//a[text()=\"Electronics \"])[1]"));
        Actions actions=new Actions(driver);
        actions.moveToElement(HoverToElectronics).perform();
        click(CellPhone);
    }

   /* By dropDowns=By.xpath("//option[text()=\"Name: Z to A\"]");

    public void setDropDowns(){
        click(dropDowns);
    }
   /* By display=By.xpath("//option[text()=\"9\"]");

    public void setDisplay(){
        click(display);
    }*/
    By selectProduct=By.xpath("(//a[text()=\"Nokia Lumia 1020\"])[1]");

    public void setSelectProduct(){
        click(selectProduct);
    }
    By addtocart=By.xpath("//button[@class=\"button-1 add-to-cart-button\"]");

    public void setAddtocart(){
        click(addtocart);
    }

    By ShoppingCart=By.xpath("//span[text()=\"Shopping cart\"]");



    public void ShoppingCart(){
       click(ShoppingCart);
    }

}
