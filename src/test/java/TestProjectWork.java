import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestProjectWork {
    private WebDriver driver;

    @BeforeEach

    @AfterEach
    public void close() {
        if(this.driver != null) {
            this.driver.close();
            this.driver.quit();
        }
    }
    @Test

}
