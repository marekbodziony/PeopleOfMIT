package marekbodziony.peopleofmit.model;

import java.util.GregorianCalendar;

public class Person {

    private int id;
    private String name;
    private String phone;
    private String mail;
    private GregorianCalendar dateOfBirth;
    private String department;
    private String imageURL;

    // constructor
    public Person(String name, int id, String phone, String mail, GregorianCalendar dateOfBirth, String imageURL){
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.mail = mail;
        department = Department.assign();
        this.dateOfBirth = dateOfBirth;
        this.imageURL = imageURL;
    }

    // getters
    public int getId() {return id;}
    private String getName() {return name;}
    public String getPhone() {return phone;}
    public String getMail() {return mail;}
    public GregorianCalendar getDateOfBirth() {return dateOfBirth;}
    public String getDepartment() {return department;}
    public String getImageURL() {return imageURL;}

}
