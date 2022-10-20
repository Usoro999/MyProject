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
        leftMenuPage = new LeftMenuPage();

        //Go to the Account page
        mainPage.clickAccountButton();
        Assert.assertEquals(mainMethodsPage.getPageTitleText(), "�����������");
        // Open Registration form
        authorizationPage.clickRegistrationButton();
        Assert.assertEquals(registrationPage.getTextHeaderTitle(), "������� �����������");

        //Fill all valid data in to form fields
        registrationPage.typeEmailIntoForm(TestData.customerEmail);
        registrationPage.typePasswordIntoForm(TestData.customerPassword);
        registrationPage.typePasswordConfirmationIntoForm(TestData.customerPassword);
        registrationPage.typeFirstNameIntoForm(TestData.customerFirstName);
        registrationPage.typeLastNameIntoForm(TestData.customerLastName);
        registrationPage.typePhoneNumberIntoForm();
        registrationPage.selectRegionIntoForm();
        registrationPage.typeCityIntoForm(TestData.customerCity);
        registrationPage.typeCityIndexIntoForm(TestData.customerPostcode);
        registrationPage.typeStreetIntoForm(TestData.customerStreet);
        registrationPage.submitRegistration();
        Thread.sleep(5000);

    }
    /*    // Verify all customer data
    @Test(priority = 0, description = "Check registration")
    public void checkRegistrationOnSite() throws InterruptedException{

        }*/
    }
