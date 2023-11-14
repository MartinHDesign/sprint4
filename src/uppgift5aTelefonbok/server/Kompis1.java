package uppgift5aTelefonbok.server;

import java.time.LocalDate;

public class Kompis1 {
    String name1;
    String phoneNumber;
    LocalDate birthday;
    String email;

    public Kompis1(String name1, String  phoneNumber, LocalDate birthday, String email) {
        this.name1 = name1;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.email = email;
    }

    public Kompis1(String name) {
        this.name1 = name;
    }


    public String getName1() {
        return name1;
    }

    public void setName1(String name) {
        this.name1 = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
