import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class nopcommercelogintestcase extends BaseTest {
    @Test
    @Parameters({"emailid","PWD"})
     public void loginpage(String emailid,String PWD) throws InterruptedException {

        nopcommerceLoginpageobj obj=new nopcommerceLoginpageobj(driver);


        obj.loginbutton();
        Thread.sleep(3000);

        obj.setEnterEmail(emailid);
        Thread.sleep(2000);

        obj.setEnterPwd(PWD);
        Thread.sleep(2000);
        obj.setCheckbox();

        obj.setLogin();
        Thread.sleep(2000);
    }




}
