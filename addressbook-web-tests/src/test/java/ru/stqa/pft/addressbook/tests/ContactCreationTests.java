package ru.stqa.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {
  WebDriver wd;

  @Test
  public void testContactCreation() throws Exception {
    SubmitContactCreation(By.linkText("add new"));
    fillContactForm(new ContactData("Тест", "Тестович", "+79098887766", "123@mail.ru"));
    initContactCreation("(//input[@name='submit'])[2]");
    returnToHomePage("home page");
  }

  public void SubmitContactCreation(By add_new) {
    wd.findElement(add_new).click();
  }

  public void fillContactForm(ContactData groupDataForm) {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys(groupDataForm.getName1());
    wd.findElement(By.name("middlename")).click();
    wd.findElement(By.name("middlename")).clear();
    wd.findElement(By.name("middlename")).sendKeys(groupDataForm.getName2());
    wd.findElement(By.name("mobile")).click();
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys(groupDataForm.getNumber());
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys(groupDataForm.getMail());
  }

  public void initContactCreation(String s) {
    wd.findElement(By.xpath(s)).click();
  }

  public void returnToHomePage(String s) {
    wd.findElement(By.linkText(s)).click();
  }

}
