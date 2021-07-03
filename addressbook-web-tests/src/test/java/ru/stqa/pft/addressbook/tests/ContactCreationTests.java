package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.SubmitContactCreation();
    app.fillContactForm(new ContactData("Тест", "Тестович", "+79098887766", "123@mail.ru"));
    app.initContactCreation();
    app.returnToHomePage();
  }

}
