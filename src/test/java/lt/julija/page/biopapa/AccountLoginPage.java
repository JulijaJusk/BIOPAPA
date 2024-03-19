package lt.julija.page.biopapa;

import lt.julija.page.Common;
import lt.julija.page.Locator;
import lt.julija.page.PageBase;

public class AccountLoginPage extends PageBase {

    public static void clickOnButtonAcceptCookies() {
        Common.waitElementVisible(Locator.Biopapa.AccountLogin.buttonAcceptCookies,6);
        Common.clickOnElement(Locator.Biopapa.AccountLogin.buttonAcceptCookies);
    }

    public static void refreshWebPage(int sec) {
        Common.refreshPage(sec);
    }

    public static void enterUserName(String userName) {
        Common.waitElementVisible(Locator.Biopapa.AccountLogin.inputUserName,8);
        Common.sendKeysToElement(Locator.Biopapa.AccountLogin.inputUserName,userName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void enterPassword(String password) {
        Common.waitElementIsEnabledCustomised(Locator.Biopapa.AccountLogin.inputPassword,8);
        Common.sendKeysToElement(Locator.Biopapa.AccountLogin.inputPassword, password);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickOnButtonLogin() {
        Common.clickOnElementByActions(Locator.Biopapa.AccountLogin.buttonLogin);
    }

    public static String readAccountName() {
        Common.waitElementVisible(Locator.Biopapa.AccountLogin.paragraphReadAccountName,8);
        return Common.getTextFromElement(Locator.Biopapa.AccountLogin.paragraphReadAccountName);
    }
}
