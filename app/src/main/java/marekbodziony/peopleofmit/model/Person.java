package marekbodziony.peopleofmit.model;

import java.util.GregorianCalendar;

public class Person {

    private int id;
    private String name;
    private String gender;
    private String phone;
    private String mail;
    private GregorianCalendar dateOfBirth;
    private String department;
    private String imageURL;
    private boolean favourite;

    // constructor
    public Person(int id, String name, String gender, String phone, String mail, GregorianCalendar dateOfBirth, String imageURL){
        this.id = id;
        this.name = name;
        this.gender = gender;
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
    public boolean getFavourite() {return favourite;}

    // setters
    public void setFavourite(boolean favourite){ this.favourite = favourite;}
}
