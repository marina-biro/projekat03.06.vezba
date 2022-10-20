import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    // klasa By. jedan element tipa by
    private By loginBtn = By.partialLinkText("PRIJAVI SE ");
    private By loginInputEmail = By.id("username_header");
    private By loginNextBtn = By.id("next-step");
    private By loginInputPassword = By.id("password_header");

    private WebElement loginBtnElement(){
        return getDriver().findElement(loginBtn);
    }


    //neophodno budući da nismo imali defaultni konstuktor. takođe da bismo mogli da koristimo driver i waiter u ovoj klasi
    public LoginPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void loginDropdownLoginBtn(){
        Select login = new Select(loginBtnElement());
        login.selectByVisibleText("Prijavi se");
    }


}
