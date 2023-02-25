package MedicalCenter;

import java.util.Date;
import java.util.Objects;

public class Patient {
    private final Date doctor;
    private String name;
    private String surname;
    private String phoneNumber;
    private String id;
    private String Doctor;
    private String registerDateTime;

    public Patient(String name, String surname, String phoneNumber, String id, Date doctor, Date registerDateTime) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.doctor = doctor;
        this.registerDateTime = String.valueOf(registerDateTime);
    }

    public Patient(Date doctor) {
        this.doctor = doctor;
    }

    public Patient(String s, String s1, String s2, String s3, Date doctor) {
        this.doctor = doctor;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String doctor) {
        Doctor = doctor;
    }

    public String getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(String registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(name, patient.name) && Objects.equals(surname, patient.surname) && Objects.equals(phoneNumber, patient.phoneNumber) && Objects.equals(id, patient.id) && Objects.equals(Doctor, patient.Doctor) && Objects.equals(registerDateTime, patient.registerDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phoneNumber, id, Doctor, registerDateTime);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", id='" + id + '\'' +
                ", Doctor='" + Doctor + '\'' +
                ", registerDateTime='" + registerDateTime + '\'' +
                '}';
    }
}