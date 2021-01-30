package week3;

public class Course {
    //The app will allow the user to create a course with these instance variables.
    private String department;
    private int crn;
    private String name;
    private int credits;

    public Course() {}

    public Course(String department, int crn, String name, int credits) {
        this.department = department;
        this.crn = crn;
        this.name = name;
        this.credits = credits;
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
