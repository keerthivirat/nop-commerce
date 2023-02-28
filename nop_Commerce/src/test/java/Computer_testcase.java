import org.testng.annotations.Test;

public class Computer_testcase extends BaseTest {
@Test
public void computerpage() throws InterruptedException {

    Computer_PO obj=new Computer_PO(driver);

    obj.setClickOnComputer();
    Thread.sleep(2000);

    obj.setNotebooks();
    Thread.sleep(2000);

    obj.setDropdown();
    Thread.sleep(2000);

    obj.setDisplay();
    Thread.sleep(2000);


}



}
