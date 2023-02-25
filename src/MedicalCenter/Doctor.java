package MedicalCenter;

import java.util.Objects;

public class Doctor {
    public static int length;
    private String name;
    private String surname;
    private String email;
    private String id;
    private String phoneNumber;
    private String profession;

    public Doctor(String name, String surname, String email, String id) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.profession = profession;
        ;

    }

    public Doctor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfession() {
        return profession;
    }

    public void setprofession (String profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor person = (Doctor) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(email, person.email) && Objects.equals(id, person.id) && Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(profession, person.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, id, phoneNumber, profession);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }

    public void setProfession(String newDate) {
    }
}