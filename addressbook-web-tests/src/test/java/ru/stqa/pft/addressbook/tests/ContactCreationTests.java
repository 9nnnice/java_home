package ru.stqa.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    SubmitContactCreation();
    fillContactForm(new ContactData("Тест", "Тестович", "+79098887766", "123@mail.ru"));
    initContactCreation();
    returnToHomePage();
  }

}
