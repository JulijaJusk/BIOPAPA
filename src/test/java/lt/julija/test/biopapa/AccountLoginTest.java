package lt.julija.test.biopapa;

import lt.julija.page.Locator;
import lt.julija.page.biopapa.AccountLoginPage;
import lt.julija.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountLoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        AccountLoginPage.open("https://www.biopapa.lt/en/my-account-2/",8);
        AccountLoginPage.clickOnButtonAcceptCookies();
        AccountLoginPage.refreshWebPage(7);
    }

    @Test
    public void testEnterValidLoginDetails(){

        String userName = "julija.demoqa";
        String password = "sunIsShining24*";
        String expectedResult = "julija.demoqa";
        String actualResult;

        AccountLoginPage.enterUserName(userName);
        AccountLoginPage.enterPassword(password);
        AccountLoginPage.clickOnButtonLogin();
        actualResult = AccountLoginPage.readAccountName();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected result: %s\nActual result: %s".formatted(expectedResult, actualResult)
        );
    }
}
