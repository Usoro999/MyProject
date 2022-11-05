    package Tests;

    import Pages.*;
    import TestData.TestData;
    import org.testng.Assert;
    import org.testng.annotations.Test;

    public class OrderTest extends MainTest{

        MainMethodsPage mainMethodsPage;
        LeftMenuPage leftMenuPage;
        MainPage mainPage;
        AuthorizationPage authorizationPage;
        RegistrationPage registrationPage;
        October14GiftsPage october14GiftsPage;
        OrderFormPage orderFormPage;
        HistoryOfOrdersPage historyOfOrdersPage;

    @Test
    public void OrderOnTheSite() throws InterruptedException {
        mainMethodsPage = new MainMethodsPage(driver);
        mainPage = new MainPage(driver);
        authorizationPage = new AuthorizationPage(driver);
        registrationPage = new RegistrationPage(driver);
        leftMenuPage = new LeftMenuPage(driver);
        october14GiftsPage = new October14GiftsPage(driver);
        orderFormPage = new OrderFormPage(driver);
        historyOfOrdersPage = new HistoryOfOrdersPage(driver);

        // Sign in on the site
        mainPage.clickAccountButton();
        Assert.assertEquals(mainMethodsPage.getPageTitleText(), "Авторизация");
        authorizationPage.inputEmailIntoField(TestData.customerEmail);
        authorizationPage.inputPasswordIntoField(TestData.customerPassword);
        authorizationPage.clickEnterButton();


        //Navigate to the Gifts page and add product to the cart
        leftMenuPage.clickBurgerButton();
        leftMenuPage.selectOctober14Page();
        october14GiftsPage.addProductToCart();
        Thread.sleep(2000);
        october14GiftsPage.confirmOrderOnPopUp();

        //Verify  the page is 'Оформление заказа'
        Assert.assertEquals(orderFormPage.getHeaderTitleText(), "Оформление заказа");
        //Verify name is filled by username
        Assert.assertEquals(orderFormPage.getTextFromNameField(), TestData.customerFirstName);
        // Send text to comment field
        orderFormPage.sendComment(TestData.testText);
        orderFormPage.selectTheCity(TestData.customerCity);
        orderFormPage.selectNPNumber();
        orderFormPage.selectPaymentMethod();
        /**orderFormPage.confirmTheOrder();
        //mainMethodsPage.switchToIframe(orderFormPage.iFrameId);
       // orderFormPage.cancelGoogleFeedback();
        // Save number of order
        String numberOfOrder = orderFormPage.getNumberOfOrder();
        // Navigate to order history page
        mainPage.clickUserButton();
        mainPage.clickOrderHistoryFromDropDown();
        // Verify the order was created - check last order number
        Assert.assertEquals(historyOfOrdersPage.getOrderNumber(), numberOfOrder);*/









    }


}
