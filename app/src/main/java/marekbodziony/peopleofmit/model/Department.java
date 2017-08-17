package marekbodziony.peopleofmit.model;

public class Department {

    private static String department;

    // randomly assign student to a group
    // data not available in DB, for presentation purpose
    public static String assignStudent(){
        int i = (int)(Math.random()*10);
        switch (i){
            case 0: department = "Aeronautics and Astronautics";
            case 1: department = "Architecture";
            case 2: department = "Biology";
            case 3: department = "Chemistry";
            case 4: department = "Civil and Environmental Engineering";
            case 5: department = "Economics";
            case 6: department = "Electrical Engineering and Computer Science";
            case 7: department = "Literature";
            case 8: department = "Mathematics";
            case 9: department = "Nuclear Science and Engineering";
            case 10: department = "Physics";
        }
        return department;
    }
}
