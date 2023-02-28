import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Computer_PO extends BaseClass{

    WebDriver driver;

    public Computer_PO(WebDriver driver){
        super(driver);

        this.driver=driver;
    }

    By ClickOnComputer=By.xpath("(//a[text()=\"Computers \"])[1]");

    public void setClickOnComputer(){
        click(ClickOnComputer);
    }
    By Notebooks=By.xpath("//a[text()=\" Notebooks \"]");

    public void setNotebooks(){
        click(Notebooks);
    }
    By Dropdown=By.xpath("//option[text()=\"Name: A to Z\"]");

    public void setDropdown(){
        click(Dropdown);
    }

    By Display=By.xpath("//option[text()=\"3\"]");

    public void setDisplay(){
        click(Display);
    }




}
