package ru.stqa.pft.addressbook;

public class UserData {
  private final String firsname;
  private final String lastname;
  private final String mobilephone;
  private final String email;
  private final String yearofbirth;

  public UserData(String firsname, String lastname, String mobilephone, String email, String yearofbirth) {
    this.firsname = firsname;
    this.lastname = lastname;
    this.mobilephone = mobilephone;
    this.email = email;
    this.yearofbirth = yearofbirth;
  }

  public String getFirsname() {
    return firsname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getMobilephone() {
    return mobilephone;
  }

  public String getEmail() {
    return email;
  }

  public String getYearofbirth() {
    return yearofbirth;
  }
}
