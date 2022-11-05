    package Tests;

    import Pages.*;
    import TestData.TestData;
    import org.testng.Assert;
    import org.testng.annotations.Test;

    public class RegistrationTest extends MainTest{

        MainMethodsPage mainMethodsPage;
        LeftMenuPage leftMenuPage;
        MainPage mainPage;
        AuthorizationPage authorizationPage;
        RegistrationPage registrationPage;

    @Test
    public void registrationOnSite() throws InterruptedException {
        mainMethodsPage = new MainMethodsPage(driver);
        mainPage = new MainPage(driver);
        authorizationPage = new AuthorizationPage(driver);
        registrationPage = new RegistrationPage(driver);
        leftMenuPage = new LeftMenuPage(driver);

        //Go to the Account page
        mainPage.clickAccountButton();
        Assert.assertEquals(mainMethodsPage.getPageTitleText(), "Авторизация");
        // Open Registration form
        authorizationPage.clickRegistrationButton();
        Assert.assertEquals(registrationPage.getTextHeaderTitle(), "Быстрая регистрация");

        //Fill all valid data in to form fields
        registrationPage.typeEmailIntoForm(TestData.customerEmail)
                        .typePasswordIntoForm(TestData.customerPassword)
                        .typePasswordConfirmationIntoForm(TestData.customerPassword)
                        .typeFirstNameIntoForm(TestData.customerFirstName)
                        .typeLastNameIntoForm(TestData.customerLastName)
                        .typePhoneNumberIntoForm()
                        .selectRegionIntoForm()
                        .typeCityIntoForm(TestData.customerCity)
                        .typeCityIndexIntoForm(TestData.customerPostcode)
                        .typeStreetIntoForm(TestData.customerStreet)
                        .submitRegistration();

        // Verify registration is successful
        Assert.assertEquals(registrationPage.getTextHeaderTitleSuccessful(),"Ваша учётная запись создана!");



    }
    }

