package marekbodziony.peopleofmit.model;

import java.util.GregorianCalendar;


public class Professor extends Person{

    private int yearsOfWork;

    public Professor(String name, int id, String phone, String mail, GregorianCalendar dateOfBirth, String imageURL) {
        super(name, id, phone, mail, dateOfBirth, imageURL);
        yearsOfWork = setRandomYearsOfWork();
    }

    // getter
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
}
