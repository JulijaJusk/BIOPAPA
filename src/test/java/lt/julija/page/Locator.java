package lt.julija.page;

import org.openqa.selenium.By;

public class Locator {
    public static class Biopapa {

        public static class AccountLogin{

            public static By buttonAcceptCookies = By
                    .xpath("//a[@class='btn btn-size-small btn-color-primary cookies-accept-btn']");
            public static By inputUserName = By.xpath("//input[@id='username']");
            public static By inputPassword = By.xpath("//input[@type='password']");
            public static By buttonLogin = By.xpath("//button[@name='login']");
            public static By paragraphReadAccountName = By
                    .xpath("//*[@id=\"post-29454\"]/div/div/div/div[2]/p[1]/strong[1]");
        }
    }
}
