package week3;


import javafx.collections.ObservableList;

public class Course {
    //The app will allow the user to create a course with these instance variables.
    private String department;
    private int crn;
    private String name;
    private int credits;
    private final String[] departmentList = {"Computer Science", "Chemistry", "Physics",
            "Mathematics", "Botany", "Zoology"};
    private final String[] departmentCodes = {"CS", "CHEM", "PHYS", "MATH"
                , "BTNY", "ZOO"};



    public Course() {}

    public Course(String department, int crn, String name, int credits) {
        this.department = department;
        this.crn = crn;
        this.name = name;
        this.credits = credits;
    }


    public String[] getDepartmentList() {
        return departmentList;
    }

    public String[] getDepartmentCodes() {
        return departmentCodes;
    }

    public void convertDepartmentToCode() {
        switch(department) {
            case "Computer Science":
                department = departmentCodes[0];
                break;
            case "Chemistry":
                department = departmentCodes[1];
                break;
            case "Physics":
                department = departmentCodes[2];
                break;
            case "Mathematics":
                department = departmentCodes[3];
                break;
            case "Botany":
                department = departmentCodes[4];
                break;
            case "Zoology":
                department = departmentCodes[5];
                break;
            default:
                department = "???";
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCrn() {
        return crn;
    }

    public void setCrn(int crn) {
        this.crn = crn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return department + " " + crn + " -- " + name + " -- " + credits + " credits";
    }

}
