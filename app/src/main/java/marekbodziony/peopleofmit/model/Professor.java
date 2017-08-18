package marekbodziony.peopleofmit.model;

import java.util.GregorianCalendar;


public class Professor extends Person{

    private String title;
    private int yearsOfWork;

    public Professor(int id, String name, String gender , String phone, String mail, GregorianCalendar dateOfBirth, String imageURL) {
        super(id, name, gender, phone, mail, dateOfBirth, imageURL);
        title = setRandomAcademicTitle();
        yearsOfWork = setRandomYearsOfWork();
    }

    // getter
    public String getTitle() {return title;}
    public int getYearsOfWork() {return yearsOfWork;}



    // randomly set professor year of work
    // data not available in DB, for presentation purpose
    private int setRandomYearsOfWork(){
        int i = 0;
        while(i <= 0 || i > 50){
            i = (int)(Math.random()*10);
        }
        return i;
    }
    // randomly set professor academic title
    // data not available in DB, for presentation purpose
    private String setRandomAcademicTitle(){
        String [] titles = {"PhD","MSc","EdD"};
        int i = 0;
        while(i >= titles.length){
            i = (int)(Math.random()*10);
        }
        return titles[i];
    }
}
