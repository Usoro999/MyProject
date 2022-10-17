    package Tests;

    import Pages.*;
    import TestData.TestData;
    import org.testng.Assert;
    import org.testng.annotations.Test;

    public class RegistrationOnSiteTest extends MainTest{

        MainMethodsPage mainMethodsPage;
        LeftMenuPage leftMenuPage;
        MainPage mainPage;
        AuthorizationPage authorizationPage;
        RegistrationPage registrationPage;

    @Test
    public void registrationOnSite(){
        //Go to the Account page
        mainPage.clickAccountButton();
        Assert.assertEquals(mainMethodsPage.getPageTitleText(),"Авторизация");
        // Open Registration form
        authorizationPage.clickRegistrationButton();
        Assert.assertEquals(registrationPage.getTextHeaderTitle(), "Быстрая регистрация");

        //Fill al valid data in to form fields
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

        // Verify all customer data







    }

    }
