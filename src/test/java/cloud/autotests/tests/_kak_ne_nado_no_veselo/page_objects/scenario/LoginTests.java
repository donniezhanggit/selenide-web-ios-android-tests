package cloud.autotests.tests._kak_ne_nado_no_veselo.page_objects.scenario;

import cloud.autotests.tests.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Feature("Selenide-appium web, iOS and Android tests")
@Story("Login tests")
@Tag("not-very-bad-practice")
@Tag("web")
@Tag("login")
class LoginTests extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    @Description("Not very bad practice - page-objects are good, but not in this simple case")
    @DisplayName("Successful login with web/iOS/Android react-native app")
    void successfulLogin() {
        loginPage.goToLoginPage();

        loginPage.fillAuthorizationForm(DEFAULT_LOGIN, DEFAULT_PASSWORD);

        loginPage.verifyIsLoggedInAs(DEFAULT_LOGIN);
    }
}
