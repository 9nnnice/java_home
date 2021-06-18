package ru.stqa.pft.addressbook;

public class ContactForm {
  private final String name1;
  private final String name2;
  private final String number;
  private final String mail;

  public ContactForm(String name1, String name2, String number, String mail) {
    this.name1 = name1;
    this.name2 = name2;
    this.number = number;
    this.mail = mail;
  }

  public String getName1() {
    return name1;
  }

  public String getName2() {
    return name2;
  }

  public String getNumber() {
    return number;
  }

  public String getMail() {
    return mail;
  }
}
