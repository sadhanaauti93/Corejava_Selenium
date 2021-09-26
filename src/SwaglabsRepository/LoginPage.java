package SwaglabsRepository;
import org.openqa.selenium.By;

public class LoginPage {
	public By username = By.id("user-name");
	public By password = By.id("password");
	public By loginbutton = By.id("login-button");
	public By incorrectcredentialserrormessage = By.xpath("//div[@class='error-message-container error']");
}
