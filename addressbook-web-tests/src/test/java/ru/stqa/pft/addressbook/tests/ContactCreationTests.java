package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().SubmitContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Тест", "Тестович", "+79098887766", "123@mail.ru"));
    app.getContactHelper().initContactCreation();
    app.returnToHomePage();
  }

}
