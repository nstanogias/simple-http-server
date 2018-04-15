package se.hitta.recruitment.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person")
public class Person {

    private int id;
    private String firstName;
    private String familyName;
    private String gender;
    private String email;
    private String homepage;

    public Person() {
    }

    public Person(int id, String firstName, String familyName, String gender, String email, String homepage) {
        this.id = id;
        this.firstName = firstName;
        this.familyName = familyName;
        this.gender = gender;
        this.email = email;
        this.homepage = homepage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }
}
