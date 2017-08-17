package marekbodziony.peopleofmit.model;

import java.util.GregorianCalendar;


public class Student {

    private int id;
    private String name;
    private String phone;
    private String mail;
    private GregorianCalendar dateOfBirth;
    private String department;
    private int yearOfStudy;
    private String imageURL;

    // constructor
    public Student(String name, int id, String phone, String mail, GregorianCalendar dateOfBirth, String imageURL){
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.mail = mail;
        department = Department.assignStudent();
        this.dateOfBirth = dateOfBirth;
        yearOfStudy = setRandomYearOfStudy();
        this.imageURL = imageURL;
    }

    // getters
    public int getId() {return id;}
    private String getName() {return name;}
    public String getPhone() {return phone;}
    public String getMail() {return mail;}
    public GregorianCalendar getDateOfBirth() {return dateOfBirth;}
    public String getDepartment() {return department;}
    public int getYearOfStudy() {return yearOfStudy;}
    public String getImageURL() {return imageURL;}


    // randomly set student year of study
    // data not available in DB, for presentation purpose
    private int setRandomYearOfStudy(){
        int i = 0;
        while(i <= 0 || i > 5){
            i = (int)(Math.random()*10);
        }
        return i;
    }
}
