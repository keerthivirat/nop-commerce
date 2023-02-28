import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class nopcommerceLoginpageobj extends BaseClass {

    WebDriver driver;

    nopcommerceLoginpageobj(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


    By loginbutton=By.xpath("//a[@class=\"ico-login\"]");

    public void loginbutton(){
        click(loginbutton);
    }
    By enterEmail=By.xpath("//input[@class=\"email\"]");

    public void setEnterEmail(String text){
        Sendkeys(enterEmail,text);
    }
    By enterPwd=By.xpath("//input[@class=\"password\"]");

    public void setEnterPwd(String text){
        Sendkeys(enterPwd,text);
    }
    By checkbox=By.xpath("//input[@id=\"RememberMe\"]");

    public void setCheckbox(){
        click(checkbox);
    }
    By login=By.xpath("//button[text()=\"Log in\"]");

    public void setLogin(){
        click(login);
    }
}
